package Model;

import config.ConnectionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    ConnectionDb cn=new ConnectionDb();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;  
    int r;
    
    
    
    public int UpsdateS(int stock,int id){
        String sql="update t_product set quantity=? where id_product=?";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    //Operaciones CRUD
    
    public List ListP(){
    String sql="select * from t_product";
    List<Product>listP=new ArrayList<>();
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Product p=new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setStock(rs.getInt(3));
                p.setStatus(rs.getString(4));
                listP.add(p);
            }
        } catch (Exception e) {
        }
        return listP; 
    }
    public int AddP(Product p){
        String sql="insert into t_product(name, quantity, status) values(?,?,?)";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getStock());
            ps.setString(3, p.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public Product SearchP(int id){
        Product p=new Product();
        String sql="select * from t_product where id_product="+id;
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setStock(rs.getInt(3));
                p.setStatus(rs.getString(4));
            }
        } catch (Exception e) {
        }
        return p;
    }
    public int UpdateP(Product p){
        String sql="update t_product set name=?, quantity=?, status=? where id_product=?";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getStock());
            ps.setString(3, p.getStatus());
            ps.setInt(4, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void DeleteL(int id){
    }
}
