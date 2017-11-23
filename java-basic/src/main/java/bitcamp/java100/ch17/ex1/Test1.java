package bitcamp.java100.ch17.ex1;

import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
        System.out.println(driver.getMajorVersion());
        System.out.println(driver.getMinorVersion());
        System.out.println(driver.toString());
    }
}
