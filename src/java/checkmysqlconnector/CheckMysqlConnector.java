/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkmysqlconnector;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Saed
 */
public class CheckMysqlConnector {
    public static void main(String[] args) {
        // TODO code application logic here
        String className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver loaded Sucessfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver failed to load Sucessfully");
            System.out.println(ex.getMessage());
        }
    }
    
}
