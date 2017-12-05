package src46.dao;

import java.util.List;

import src46.domain.Room;

public interface RoomDao {
    List<Room> selectList();    
    int insert(Room room);
    int delete(int no);
}