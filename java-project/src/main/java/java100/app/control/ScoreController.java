package java100.app.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;

@Controller
public class ScoreController {
    
    @Autowired ScoreDao scoreDao;
    
    @RequestMapping("/score/list")
    public String list(
            HttpServletRequest request, HttpServletResponse response)
                    throws Exception {
        
        Map<String,Object> data = new HashMap<>();
        data.put("orderColumn", "regdt");
        data.put("align", "asc");
        
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("1");
        list.add("5");
//        data.put("words", list);
        List<Score> records = scoreDao.findAll(data);
        
        request.setAttribute("list", list);

        return "score/list";
    }
    
    @RequestMapping("/score/add")
    public String add(
            Score score,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        scoreDao.insert(score);
        
        return "redirect:list.do";
    }
    
    @RequestMapping("/score/delete")
    public String delete(
            @RequestParam("no") int no,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        scoreDao.delete(no);
        return "redirect:list.do";
        
    }
    
    @RequestMapping("/score/form")    
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "score/form";
        
    }
    
    @RequestMapping("/score/update")
    public String update(
            Score score,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        scoreDao.update(score);
        return "redirect:list.do";

    }
    
    @RequestMapping("/score/view")
    public String view(
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
    
        Score score = scoreDao.findByNo(no);
        
        request.setAttribute("score", score);
        
        return "score/view";
    }
}
