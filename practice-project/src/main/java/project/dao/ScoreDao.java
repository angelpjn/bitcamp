package project.dao;

import java.util.List;

import project.domain.Score;

public interface ScoreDao {
    List<Score> selectList();
    int insert(Score score);
    int update(Score score);
    int delete(int no);
    Score selectOne(int no);
}















