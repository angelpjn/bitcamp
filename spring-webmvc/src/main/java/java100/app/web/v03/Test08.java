package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/v03/test08")
@SessionAttributes({"name", "age"})
public class Test08 {

    @RequestMapping(value="/m1")
    public String m1(HttpSession session, Model model) {
        model.addAttribute("name", "유관순");
        model.addAttribute("age", 16);
        model.addAttribute("working", true);
        
        session.setAttribute("working", true);
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m2")
    public String m2(HttpSession session) {
        
        session.invalidate();
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m3")
    public String m3(SessionStatus status) {
        status.setComplete();
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m4")
    public String m4(HttpSession session, SessionStatus status) {
        
        session.invalidate();
        status.setComplete();
        
        return "v03/test08/m1";
    }
}





























