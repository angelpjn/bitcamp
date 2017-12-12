package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;


@SuppressWarnings("serial")
@WebServlet("/step8/Servlet09")
public class Servlet09 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        MultipartRequest multi = new MultipartRequest(req, "C:\\Users\\user1\\Desktop\\down");
        
        String name = multi.getParameter("name");
        String age = multi.getParameter("age");
        String photo1Filename = multi.getFilesystemName("photo1");
        String photo2Filename = multi.getFilesystemName("photo2");
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.printf("이름 = %s\n", name);
        out.printf("나이 = %s\n", age);
        out.printf("사진1 = %s\n", photo1Filename);
        out.printf("사진2 = %s\n", photo2Filename);
        
    }
}
 