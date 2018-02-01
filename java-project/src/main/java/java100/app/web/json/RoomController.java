package java100.app.web.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java100.app.domain.Room;
import java100.app.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
    
    @Autowired RoomService roomService;
    
    @RequestMapping("list")
    public Object list(
            @RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="words", required=false) String[] words,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align) throws Exception {
        
        // UI 제어와 관련된 코드는 이렇게 페이지 컨트롤러에 두어야 한다.
        //
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
        
        int totalCount = roomService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            lastPageNo++;
        }
        
        HashMap<String, Object> result = new HashMap<>();
        // view 컴포넌트가 사용할 값을 Model에 담는다.
        result.put("pageNo", pageNo);
        result.put("lastPageNo", lastPageNo);
        result.put("list", roomService.list(pageNo, pageSize, options));
        return result;
    }
    
    @RequestMapping("form")
    public String form() throws Exception {
        return "room/form";
    }
    
    @RequestMapping("add")
    public String add(Room room) throws Exception {
        
        roomService.add(room);
        return "redirect:list";
    }
    
    @RequestMapping("delete")
    public String delete(int no) throws Exception {
        
        roomService.delete(no);
        return "redirect:list";
    }
}








