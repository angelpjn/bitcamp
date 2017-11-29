package practice.dao;

import java.util.List;

import practice.domain.Room;

public interface RoomDao {
    public List<Room> selectList();
    public int insert(Room room);
    public int delete(int no);
}















