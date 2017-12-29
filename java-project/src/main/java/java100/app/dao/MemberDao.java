package java100.app.dao;

import java.util.List;

import java100.app.domain.Member;

public interface MemberDao {
    List<Member> findAll();    
    int insert(Member member);
    int update(Member member);
    int delete(int no);
    Member findByNo(int no); 
}















