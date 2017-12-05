package src48.dao;

import java.util.List;

import src48.domain.Room;

public interface RoomDao {
    List<Room> selectList();    
    int insert(Room room);
    int delete(int no);
}