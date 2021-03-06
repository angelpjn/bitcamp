package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("   width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>회원상세정보</h1>");
        
        out.println("<form method='post'>");
        
        out.println("<div class='form-group row'>");
        out.println("<label for='name' class='col-sm-2 col-form-label col-form-label-sm'>이름</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control form-control-sm' id='name' type='text' name='name'>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label for='email' class='col-sm-2 col-form-label col-form-label-sm'>이메일</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control form-control-sm' id='email' type='text' name='email'>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label for='password' class='col-sm-2 col-form-label col-form-label-sm'>비밀번호</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control form-control-sm' id='text' type='password' name='password'>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<button class='btn btn-primary btn-sm'>추가</button>");
        
        out.println("</form>");
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("   width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>회원 등록</h1>");
        
        try {
            
            Member member = new Member();
            member.setName(request.getParameter("name"));
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("password"));
            
            memberDao.insert(member);
            
            out.println("<p>저장하였습니다.</p>");
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    } 
}










