package src48.dao;

import java.util.List;

import src48.domain.Member;

public interface MemberDao {
    List<Member> selectList();    
    int insert(Member member);
    int update(Member member);
    int delete(int no);
    Member selectOne(int no); 
}















