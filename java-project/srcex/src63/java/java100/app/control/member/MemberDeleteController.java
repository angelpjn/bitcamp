package java100.app.control.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;

@Component("/member/delete")
public class MemberDeleteController {
    
    @Autowired
    MemberDao memberDao;
    
    @RequestMapping
    public String delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        Member member = new Member();
        member.setNo(Integer.parseInt(request.getParameter("no")));
        member.setName(request.getParameter("name"));
        member.setEmail(request.getParameter("email"));
        member.setPassword(request.getParameter("password"));
        
        int no = Integer.parseInt(request.getParameter("no"));
        memberDao.delete(no);
        return "redirect:list.do";

    }
}
