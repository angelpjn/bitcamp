package java100.app.servlet.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@WebServlet("/board/list")
@SuppressWarnings("serial")
public class BoardListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        response.setContentType("text/html;charset=UTF-8");
    
        List<Board> list = boardDao.selectList();
        
        request.setAttribute("list", list);
        
        request.setAttribute("viewName", "/board/list.jsp");
        
    }
}
