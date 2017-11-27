package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.domain.Member;
import util.DataSource;

public class MemberDao {
    
    public List<Member> selectList() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "select no, name, email, regdt from ex_memb");
            rs = pstmt.executeQuery();
            ArrayList<Member> list = new ArrayList<>();
            
            while (rs.next()) {
                Member member = new Member(
                rs.getInt("no"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getDate("regdt"));
                list.add(member);
            }
            return list;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {rs.close();} catch (Exception e) {}
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    
    public int insert(Member member) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "insert into ex_memb(name, email, pwd, regdt) values(?, ?, password(?), now())");

            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getPassword());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    
    public int update(Member member) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "update ex_memb set name=?, pwd=password(?), email=? where no=?");
            pstmt.setString(1,  member.getName());
            pstmt.setString(2,  member.getPassword());
            pstmt.setString(3,  member.getEmail());
            pstmt.setInt(4,  member.getNo());
            
            return pstmt.executeUpdate(); // 그대로 변경 개수 리턴
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    
    public int delete(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                "delete from ex_memb where no=?");
            
            pstmt.setInt(1, no);

            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }

    public Member selectOne(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement(
                    "select no, name, email from ex_memb where no=?");
            pstmt.setInt(1, no);

            rs = pstmt.executeQuery();

            Member member = null;
            if (rs.next()) {
                member = new Member();
                member.setNo(no);
                member.setName(rs.getString("name"));
                member.setEmail(rs.getString("email"));
            }
            rs.close();
            return member;
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {rs.close();} catch (Exception e) {}
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
}
