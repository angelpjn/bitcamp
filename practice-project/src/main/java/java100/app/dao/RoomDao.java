package java100.app.dao;

import java.util.List;

import java100.app.domain.Room;

public interface RoomDao {
    public int delete(int no);
    public List<Room> selectList();
    public int insert(Room room);
}


















