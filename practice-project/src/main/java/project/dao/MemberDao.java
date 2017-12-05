package project.dao;

import java.util.List;

import project.domain.Member;

public interface MemberDao {
    List<Member> selectList();    
    int insert(Member member);
    int update(Member member);
    int delete(int no);
    Member selectOne(int no); 
}















