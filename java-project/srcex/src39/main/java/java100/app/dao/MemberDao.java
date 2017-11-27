package java100.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.domain.Member;
import java100.app.domain.Score;

public class MemberDao {
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
    }
    
    public List<Member> selectList() {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement(
                        "select no, name, email, regdt from ex_memb");
                ResultSet rs = pstmt.executeQuery();) {
            
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
        }
    }
    
    public int insert(Member member) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement(
                        "insert into ex_memb(name, email, pwd, regdt) values(?, ?, password(?), now())");
                ) {
            
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getPassword());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }
    
    public int update(Member member) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement(
                        "update ex_memb set name=?, pwd=password(?), email=? where no=?");
                ) {

            pstmt.setString(1,  member.getName());
            pstmt.setString(2,  member.getPassword());
            pstmt.setString(3,  member.getEmail());
            pstmt.setInt(4,  member.getNo());
            
            return pstmt.executeUpdate(); // 그대로 변경 개수 리턴
            
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }
    
    public int delete(int no) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement(
                        "delete from ex_memb where no=?");
                ) {
            
            pstmt.setInt(1, no);

            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public Member selectOne(int no) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement(
                        "select no, name, email from ex_memb where no=?");
                ) {

            pstmt.setInt(1, no);

            ResultSet rs = pstmt.executeQuery();

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
        }
    }
}
