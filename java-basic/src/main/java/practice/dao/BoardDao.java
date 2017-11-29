package practice.dao;

import java.util.List;

import practice.domain.Board;

public interface BoardDao {
    public List<Board> selectList();
    public int insert(Board board);
    public int update(Board board);
    public int delete(int no);
    public Board selectOne(int no);
}
