package src47.dao;

import java.util.List;

import src47.domain.Board;

public interface BoardDao {
    List<Board> selectList();
    int insert(Board board);
    int update(Board board);
    int delete(int no);
    Board selectOne(int no);        
}















