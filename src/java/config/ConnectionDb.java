package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {
    Connection con;
    String url="jdbc:mysql://172.30.2.15:3306/handle_pruebas";
    String user="root";
    String pass="QCNlhx91693";
    
    public Connection Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
