package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test4 {
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb",
                "study", "1111");
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select * from jdbc_test");

        while (rs.next()) {
            System.out.printf("%d, %s, %s, %s, %d\n", 
                    rs.getInt("no"), rs.getString(2), rs.getString("conts"), 
//                    rs.getString("regdt"), rs.getInt("vwcnt"));
            rs.getDate("regdt")/*.toString()*/, rs.getInt("vwcnt"));
//            rs.getDate("regdt").toString() => 15, aaa, aaaa, 2017-11-23, 0
//            rs.getString("regdt") => 15, aaa, aaaa, 2017-11-23 12:36:08.0, 0
        }
        
        rs.close();
        stmt.close();
        con.close();
    }
}
