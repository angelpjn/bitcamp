package src48.dao;

import java.util.List;

import src48.domain.Score;

public interface ScoreDao {
    List<Score> selectList();
    int insert(Score score);
    int update(Score score);
    int delete(int no);
    Score selectOne(int no);
}















