package java100.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataSource {
    
    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    ArrayList<Connection> list = new ArrayList<>(); 
    
    synchronized public Connection getConnection() throws SQLException, ClassNotFoundException {
        
        if (list.size() > 0) {
            return list.remove(0);
        }
        
        Class.forName(this.driverClassName);

        return DriverManager.getConnection(
                this.url, this.userName, this.password);
    }
    
    synchronized public void returnConnection(Connection con) {
        try {
            if (con == null) return;
            if (con.isClosed()) return;
            list.add(con);
            
        } catch (Exception e) {}
    }
    
    synchronized public void close() {
        for (Connection con : list) {
            try {con.close();} catch (Exception e) {}
        }
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}






