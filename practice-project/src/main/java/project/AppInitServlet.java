package project;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import project.util.DataSource;

@WebServlet(
        urlPatterns="/init",
        name="AppInitServlet",
        loadOnStartup=1)
@Configuration
@ComponentScan("project")
public class AppInitServlet implements Servlet {

    ServletConfig servletConfig;
    public static AnnotationConfigApplicationContext iocContainer;

    @Bean
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUserName("study");
        ds.setPassword("1111");
        return ds;
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        iocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "이 서블릿은 다른 서블릿을 위한 스프링 IoC 컨테이터를 준비한다.";
    }

    @Override
    public void destroy() {
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
    }


}















