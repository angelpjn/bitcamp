package java100.app.control.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;

@Component("/member/view")
public class MemberViewController implements PageController {
    
    @Autowired
    MemberDao memberDao;
    
    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        int no = Integer.parseInt(request.getParameter("no"));
        Member member = memberDao.selectOne(no);
        
        request.setAttribute("member", member);
        
        return "/member/view.jsp";

    }
}
