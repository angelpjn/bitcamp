package java100.app.control;

import java.io.PrintWriter;
import java.util.List;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

public class RoomController implements Controller {

    RoomDao roomDao = new RoomDao();
    
    @Override
    public void destroy() {}

    @Override
    public void init() {}

    @Override
    public void execute(Request request, Response response) {

        switch (request.getMenuPath()) {
        case "/room/list": this.doList(request, response);
            break;
        case "/room/add": this.doAdd(request, response);
            break;
        case "/room/delete": this.doDelete(request, response);
            break;
        case "/room/update": this.doUpdate(request, response);
            break;
        default:
            System.out.println("해당 명령이 없습니다.");
        }
    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 변경]");

        try {
            Room room = new Room();
            
            if (roomDao.update(room) > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("%s 강의실이 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");

        try {
            List<Room> list = roomDao.selectList();
            for (Room room : list) {
                
                out.printf("%d, %s, %s, %d\n", 
                        room.getNo(),
                        room.getLoc(),
                        room.getName(),
                        room.getCapacity());
            }
        } catch (Exception e) {
            e.printStackTrace();    
            out.println(e.getMessage());
        }
    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 등록]");

        try {
            Room room = new Room();
            room.setLoc(request.getParameter("loc"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
            roomDao.insert(room);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");

        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (roomDao.delete(no) > 0) {
                out.println("삭제하였습니다.");
            } else {
                out.printf("%s 강의실이 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

}
