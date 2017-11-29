package src46.app.dao;

import java.util.List;

import src46.app.domain.Board;

public interface BoardDao {
    List<Board> selectList();
    int insert(Board board);
    int update(Board board);
    int delete(int no);
    Board selectOne(int no);        
}















