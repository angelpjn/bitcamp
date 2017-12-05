package src46.dao;

import java.util.List;

import src46.domain.Board;

public interface BoardDao {
    List<Board> selectList();
    int insert(Board board);
    int update(Board board);
    int delete(int no);
    Board selectOne(int no);        
}















