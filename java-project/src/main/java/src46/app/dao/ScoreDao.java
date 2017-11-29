package src46.app.dao;

import java.util.List;

import src46.app.domain.Score;

public interface ScoreDao {
    List<Score> selectList();
    int insert(Score score);
    int update(Score score);
    int delete(int no);
    Score selectOne(int no);
}















