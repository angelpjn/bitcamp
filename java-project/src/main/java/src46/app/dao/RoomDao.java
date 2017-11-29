package src46.app.dao;

import java.util.List;

import src46.app.domain.Room;

public interface RoomDao {
    List<Room> selectList();    
    int insert(Room room);
    int delete(int no);
}