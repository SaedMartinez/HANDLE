package Modelo;


import java.util.List;
import config.Conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;

public class ProductDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public List listing(){
        String sql="select * from t_products";
        List<Product>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Product p=new Product();
                p.setMid_producto(rs.getInt(1));
                p.setMname(rs.getNString(2));
                p.setMdescription(rs.getNString(3));
                p.setMq_stock(rs.getInt(4));
                p.setMphoto(rs.getBinaryStream(5));
                p.setMid_category(rs.getInt(6));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public void listingImg(int id,HttpServletResponse response){
        String sql="select * from t_products where id_product="+id;
        InputStream inputStream=null;
        OutputStream outputStream=null;
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                inputStream=rs.getBinaryStream("photo");
            }
            bufferedInputStream=new BufferedInputStream(inputStream);
            bufferedOutputStream=new BufferedOutputStream(outputStream);
            int i=0;
            while((i=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(i);
            }
        } catch (Exception e) {
        }
    }
    /*
    public int add(Product p){
        String sql="insert into t_products()values(?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }  
    
    public int listingId(int id){
    }
    
    public int update(Product p){
    }
    
    */
}
