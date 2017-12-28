package java100.app.dao;

import java.util.List;

import java100.app.domain.Member;

public interface MemberDao {
    public int delete(int no);
    public int update(Member member);
    public Member selectOne(int no);
    public List<Member> selectList();
    public int insert(Member member);
}


















