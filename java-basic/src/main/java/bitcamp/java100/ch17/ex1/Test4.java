package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {
    public static void main(String[] args) throws Exception {
        
        // JAVA - DBMS 연결 프로세스 : Driver 클래스 로딩 - 객체 생성 - 해당 객체 등록 - 연결
        // Class.forName() => 해당 문자열을 파라로 받아 로딩
        // Driver 클래스 => static 블록에서 본인의 객체생성 - 해당 객체 등록
        // 그러므로 연결만 해주면 됨. 실무에서 주로 쓰는 방식
        
        //Class.forName() : Returns the object associated with the class or interface with the given string name.
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb",
                "study", "1111");
        System.out.println("연결되었음!");
        
        con.close();
    }
}
