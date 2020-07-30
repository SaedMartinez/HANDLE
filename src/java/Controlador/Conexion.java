/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Saed
 */
public class Conexion {

    private String username = "root", password = "123", host = "localhost", port = "3306", database = "handle_db", classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
    private Connection con;

    public Conexion() {
        try {
            Class.forName(classname);
            con= DriverManager.getConnection(url, username, password);
        } catch(ClassNotFoundException e) {
            System.err.println("ERROR"+e);
        } catch (SQLException e){
            System.err.println("ERROR"+e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    public static void main(String[] args) {
        Conexion con= new Conexion();
    }
   
}


