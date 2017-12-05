package src45.java100.app.dao;

import java.util.List;

import src45.java100.app.domain.Member;

public interface MemberDao {
    List<Member> selectList();    
    int insert(Member member);
    int update(Member member);
    int delete(int no);
    Member selectOne(int no); 
}















