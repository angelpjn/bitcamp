package practice.dao;

import java.util.List;

import practice.domain.Score;

public interface ScoreDao {
    public List<Score> selectList();
    public int insert(Score score);
    public int update(Score score);
    public int delete(int no);
    public Score selectOne(int no);
}















