package java100.app.control;

import java.util.List;

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

        List<Board> list = boardDao.findAll();
        request.setAttribute("list", list);
        
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
