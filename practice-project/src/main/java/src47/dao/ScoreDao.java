package src47.dao;

import java.util.List;

import src47.domain.Score;

public interface ScoreDao {
    List<Score> selectList();
    int insert(Score score);
    int update(Score score);
    int delete(int no);
    Score selectOne(int no);
}















