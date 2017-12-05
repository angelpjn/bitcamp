package project.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/board/*")
public class HelloServlet implements Servlet {
    ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public String getServletInfo() {
        return "인사를 위한 서블릿";
    }

    @Override
    public void destroy() {
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request; 
        HttpServletResponse httpResponse = (HttpServletResponse) response; 

        httpRequest.getContentType("text/plain; charset=UTF-8");
        
        switch (request.getMenuPath()) {
        case "/hello/hi":
            this.doHi(request, response);
            break;
        case "/hello/hi2":
            this.doHi2(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doHi(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("하이루~~~");

    }

    private void doHi2(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("오호라~~~~~안녕!");
    }

}
