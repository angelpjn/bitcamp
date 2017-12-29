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

import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Controller
public class BoardController {
    
    @Autowired BoardDao boardDao;
    
    @RequestMapping("/board/list")
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map<String,Object> data = new HashMap<>();
        data.put("orderColumn", "regdt");
        data.put("align", "asc");
        
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("1");
        list.add("5");
//        data.put("words", list);
        
        List<Board> records = boardDao.findAll(data);
        request.setAttribute("records", records);
        
        return "board/list";

    }
    
    @RequestMapping("/board/add")
    public String add(
            Board board,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        boardDao.insert(board);
        return "redirect:list.do";
    }
  
    @RequestMapping("/board/delete")
    public String delete(
            Board board,
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        boardDao.delete(no);
        
        return "redirect:list.do";

    }
    
    @RequestMapping("/board/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "board/form";

    }
    
    @RequestMapping("/board/update")
    public String update(
            Board board,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        boardDao.update(board);
        return "redirect:list.do";

    }
    
    @RequestMapping("/board/view")
    public String view(
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        boardDao.viewUpdate(no);
        Board board = boardDao.findByNo(no);
        
        request.setAttribute("board", board);
        
        return "board/view";

    }
}
