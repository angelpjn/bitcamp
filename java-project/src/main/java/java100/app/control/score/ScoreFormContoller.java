package java100.app.control.score;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java100.app.control.PageController;

@Component("/score/form")
public class ScoreFormContoller implements PageController {

    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "/score/form.jsp";
    }
}
