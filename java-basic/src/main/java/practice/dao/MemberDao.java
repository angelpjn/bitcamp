package practice.dao;

import java.util.List;

import practice.domain.Member;

public interface MemberDao {
    public List<Member> selectList();
    public int insert(Member member);
    public int update(Member member);
    public int delete(int no);
    public Member selectOne(int no);
}















