package java100.app.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import java100.app.domain.Member;
import java100.app.domain.Trainning;
import java100.app.domain.TrainningUploadFile;
import java100.app.service.TrainningService;

@Controller
@RequestMapping("/trainning")
@SessionAttributes("loginUser")
public class TrainningController {
    
    @Autowired ServletContext servletContext;
    @Autowired TrainningService trainningService;
     
    @RequestMapping("list")
    public String list(
            @RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="words", required=false) String[] words,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {

        if (pageNo < 1) {
            pageNo = 1;
        }
        
        if (pageSize < 5 || pageSize > 15) {
            pageSize = 5;
        }
        
        HashMap<String,Object> options = new HashMap<>();
        if (words != null && words[0].length() > 0) {
            options.put("words", words);
        }
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        int totalCount = trainningService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            lastPageNo++;
        }
        
        // view 컴포넌트가 사용할 값을 Model에 담는다.
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo", lastPageNo);
        model.addAttribute("list", trainningService.list(pageNo, pageSize, options));
        return "trainning/list";
    }
    
    @RequestMapping("form")
    public String form() throws Exception {
        return "trainning/form";
        
    }

    @RequestMapping("add")
    public String add(
            Trainning trainning,
            @ModelAttribute(value="loginUser") Member loginUser,
            MultipartFile[] file
            ) throws Exception {
        
        String uploadDir = servletContext.getRealPath("/download");

        ArrayList<TrainningUploadFile> uploadFiles = new ArrayList<>();
        
        for (MultipartFile part : file) {
            if (part.isEmpty())
                continue;
            
            String filename = this.writeUploadFile(part, uploadDir);
            
            uploadFiles.add(new TrainningUploadFile(filename));
        }
        
        trainning.setFiles(uploadFiles);
        trainning.setMember(loginUser);
        trainningService.add(trainning);
        
        return "redirect:list";
    }

    @RequestMapping("{no}")
    public String view(@PathVariable int no, Model model) throws Exception {
        
        model.addAttribute("trainning", trainningService.get(no));
        return "trainning/view";
    }

    @RequestMapping("update")
    public String update(
            Trainning trainning, 
            MultipartFile[] file) throws Exception {
        
        String uploadDir = servletContext.getRealPath("/download");

        ArrayList<TrainningUploadFile> uploadFiles = new ArrayList<>();
        
        for (MultipartFile part : file) {
            if (part.isEmpty())
                continue;
            
            String filename = this.writeUploadFile(part, uploadDir);
            
            uploadFiles.add(new TrainningUploadFile(filename));
        }
        
        trainning.setFiles(uploadFiles);

        trainningService.update(trainning);
        
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(int no) throws Exception {

        trainningService.delete(no);
        return "redirect:list";
    }

    long prevMillis = 0;
    int count = 0;
    
    // 다른 클라이언트가 보낸 파일명과 중복되지 않도록 
    // 서버에 파일을 저장할 때는 새 파일명을 만든다.
    synchronized private String getNewFilename(String filename) {
        long currMillis = System.currentTimeMillis();
        if (prevMillis != currMillis) {
            count = 0;
            prevMillis = currMillis;
        }
        
        return  currMillis + "_" + count++ + extractFileExtName(filename); 
    }
    
    // 파일명에서 뒤의 확장자명을 추출한다.
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");
        
        if (dotPosition == -1)
            return "";
        
        return filename.substring(dotPosition);
    }
    
    private String writeUploadFile(MultipartFile part, String path) throws IOException {
        
        String filename = getNewFilename(part.getOriginalFilename());
        part.transferTo(new File(path + "/" + filename));
        return filename;
    }    
}








