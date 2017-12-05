package src45.java100.app.dao;

import java.util.List;

import src45.java100.app.domain.Room;

public interface RoomDao {
    List<Room> selectList();    
    int insert(Room room);
    int delete(int no);
}