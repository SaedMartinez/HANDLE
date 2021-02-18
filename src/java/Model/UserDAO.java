package Model;

import config.ConnectionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDAO {
    
    ConnectionDb cn = new ConnectionDb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public User ValidateL(String muser, String mpass) {
        User us = new User();
        String sql = "select * from t_user where user=? and pass=?";
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, muser);
            ps.setString(2, mpass);
            rs = ps.executeQuery();
            while (rs.next()) {
                us.setId(rs.getInt(1));
                us.setPass(rs.getString(2));
                us.setName(rs.getString(3));
                us.setPnum(rs.getString(4));
                us.setStatus(rs.getString(5));
                us.setUser(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return us;
    }
    
    public List ListU() {
        String sql = "select * from t_user";
        List<User> listU = new ArrayList<>();
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User us = new User();
                us.setId(rs.getInt(1));
                us.setPass(rs.getString(2));
                us.setName(rs.getString(3));
                us.setPnum(rs.getString(4));
                us.setStatus(rs.getString(5));
                us.setUser(rs.getString(6));
                /*    espacio foto    */
                listU.add(us);
            }
        } catch (Exception e) {

        }
        return listU;
    }

    public int AddU(User us) {
        String sql = "insert into t_user (pass, name, phone, status, user)values(?,?,?,?,?)";
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getPass());
            ps.setString(2, us.getName());
            ps.setString(3, us.getPnum());
            ps.setString(4, us.getStatus());
            ps.setString(5, us.getUser());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public User ListId(int id) {
        User uss = new User();
        String sql = "select * from t_user where id_user="+id;
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                uss.setPass(rs.getString(2));
                uss.setName(rs.getString(3));
                uss.setPnum(rs.getString(4));
                uss.setStatus(rs.getString(5));
                uss.setUser(rs.getString(6));

            }
        } catch (Exception e) {
        }
        return uss;
    }

    public int Update(User us) {
        String sql = "update t_user set pass=?, name=?, phone=?, status=?, user=? where id_user=?";
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getPass());
            ps.setString(2, us.getName());
            ps.setString(3, us.getPnum());
            ps.setString(4, us.getStatus());
            ps.setString(5, us.getUser());
            ps.setInt(6, us.getId());
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;

    }

    public int Desactivate(User us) {
        String sql = "update t_user set status=? where id_user=?";
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getStatus());
            ps.setInt(2, us.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
