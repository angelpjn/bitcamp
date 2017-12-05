package project.dao;

import java.util.List;

import project.domain.Room;

public interface RoomDao {
    List<Room> selectList();    
    int insert(Room room);
    int delete(int no);
}