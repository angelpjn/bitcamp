package src47.dao;

import java.util.List;

import src47.domain.Room;

public interface RoomDao {
    List<Room> selectList();    
    int insert(Room room);
    int delete(int no);
}