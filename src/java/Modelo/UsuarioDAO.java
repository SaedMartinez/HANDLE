
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario daovalidar(String user,String password){
        Usuario us=new Usuario();
        String sql="select * from t_user where user=? and pass=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while (rs.next()){
                us.setMid_user(rs.getInt("id_user"));
                us.setMname(rs.getString("name"));
                us.setMuser(rs.getString("user"));
                us.setMpass(rs.getString("pass"));
                us.setMdescription(rs.getString("description"));
            }
        } catch (Exception e) {
        }
        return us;
    }
}
