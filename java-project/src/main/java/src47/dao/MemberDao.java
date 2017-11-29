package src47.dao;

import java.util.List;

import src47.domain.Member;

public interface MemberDao {
    List<Member> selectList();    
    int insert(Member member);
    int update(Member member);
    int delete(int no);
    Member selectOne(int no); 
}















