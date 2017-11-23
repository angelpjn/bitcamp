package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.SQLException;

public class Test2 {
    public static void main(String[] args) throws SQLException {
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
        
        /*
         jdbc:mysql://address=(key1=value)[(key2=value)]...[,address=(key3=value)[(key4=value)]...]...[/[database]]
              [?propertyName1=propertyValue1[&propertyName2=propertyValue2]...]
              
              propertyname = 권한 가진 id
         */
        
        Connection con = driver.connect("jdbc:mysql://localhost:3306/studydb?user=study&password=1111", null);
        System.out.println("연결되었음!");
        
        con.close();
    }
}
