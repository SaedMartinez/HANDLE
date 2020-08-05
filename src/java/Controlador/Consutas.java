/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Saed
 */
public class Consutas extends Conexion{
    
    public boolean autenticacion(String nombre, String contraseña){
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
            String consulta ="SELECT * FROM users WHERE name= ? and pass= ?";
            pst= getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, contraseña);
            rs =pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error "+e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs !=null) rs.close();
            } catch (Exception e) {
                System.err.println("Error "+e);
            }
        }
        return false;
        
    }
    public boolean registrar(String nombre,String contraseña,String estado,String cargo,String nivel){
        
        PreparedStatement pst=null;
        try {
            String consulta = "INSERT INTO users (name, pass, ustatus, uposition, ulevel) VALUES (?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, contraseña);
            pst.setString(3, estado);
            pst.setString(4, cargo);
            pst.setString(5, nivel);
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception ex) {
            System.err.println("Error"+ex);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        return false;
    }
}
