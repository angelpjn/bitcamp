package java100.app.control.room;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.RoomDao;

@Component("/room/delete")
public class RoomDeleteController implements PageController {
    @Autowired
    RoomDao roomDao;
    
    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
    
        int no = Integer.parseInt(request.getParameter("no"));
        
        roomDao.delete(no);
        return "redirect:list.do";
    }
}
