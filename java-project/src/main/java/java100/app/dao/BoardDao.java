package java100.app.dao;

import java.util.List;

import java100.app.domain.Board;

public interface BoardDao {
    List<Board> findAll();
    int insert(Board board);
    int update(Board board);
    int delete(int no);
    int viewUpdate(int no);
    Board findByNo(int no);        
}















