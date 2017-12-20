package java100.app.control.score;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

@Component("/score/delete")
public class ScoreDeleteContoller implements PageController {

    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
    
        int no = Integer.parseInt(request.getParameter("no"));
        scoreDao.delete(no);
        return "redirect:list.do";
    }
}
