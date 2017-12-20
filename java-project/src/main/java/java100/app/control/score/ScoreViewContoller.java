package java100.app.control.score;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@Component("/score/view")
public class ScoreViewContoller implements PageController {

    @Autowired ScoreDao scoreDao;
    
    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
    
        int no = Integer.parseInt(request.getParameter("no"));
        Score score = scoreDao.selectOne(no);
        
        request.setAttribute("score", score);
        
        return "/score/view.jsp";
        
    }
}
