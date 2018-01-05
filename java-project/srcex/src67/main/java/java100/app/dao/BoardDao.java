package java100.app.dao;

import java.util.HashMap;
import java.util.List;

import java100.app.domain.Board;

public interface BoardDao {
    List<Board> findAll(HashMap<String,Object> params);
    int insert(Board board);
    int update(Board board);
    int delete(int no);
    void viewUpdate(int no);
    Board findByNo(int no);        
}















