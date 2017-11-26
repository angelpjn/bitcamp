package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test3 {
    public static void main(String[] args) throws SQLException {
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
//        Connection con = driver.connect("jdbc:mysql://localhost:3306/studydb?user=study&password=1111", null);
//        System.out.println("연결되었음!");
        
        DriverManager.registerDriver(driver);
        
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111", null);

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        System.out.println("연결되었음!");
        
        con.close();
    }
}