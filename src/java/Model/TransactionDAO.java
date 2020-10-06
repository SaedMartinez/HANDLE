package Model;

import config.ConnectionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    
    ConnectionDb cn=new ConnectionDb();
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;  
    int dato;
    String cnumber;
    int r;
    
    // METODOS SERIE ---------------------------
    public String IncrementateSn(int inc){
        this.dato=inc+1;
        if((this.dato>=10000)&(this.dato<=100000)){
            cnumber=""+dato;
        }
        if((this.dato>=1000)&(this.dato<=10000)){
            cnumber="0"+dato;
        }if((this.dato>=100)&(this.dato<=1000)){
            cnumber="00"+dato;
        }if((this.dato>=10)&(this.dato<=100)){
            cnumber="000"+dato;
        }
        if((this.dato<10)){
           cnumber="0000"+dato;
        }
        return cnumber;
    }
    
    
    public String ReadSn(){
        String snumber="";
        String sql="select max(serial_number) from t_transaction";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               snumber=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return  snumber;
    }
    
    //FIN METODOS SERIE ---------------------------
    
    public String IdTransaction(){
        String idtransaction="";
        String sql="select max(id_transaction) from t_transaction";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               idtransaction=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idtransaction;
    }
    
    public int SaveTransaction(Transaction tr){
        String sql="insert into t_transaction (id_user,serial_number, date, status)values(?,?,?,?)";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            ps.setInt(1, tr.getMiduser());
            ps.setString(2, tr.getSnumber());
            ps.setString(3, tr.getMdate());
            ps.setString(4, tr.getMstatusp());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public List ReadTransaction(){
        String sql = "select * from t_transaction";
        List<Transaction> listT = new ArrayList<>();
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Transaction tr=new Transaction();
                tr.setId(rs.getInt(1));
                tr.setMiduser(rs.getInt(2));
                tr.setSnumber(rs.getString(3));
                tr.setMdate(rs.getString(4));
                tr.setMstatusp(rs.getString(5));
                /*    espacio foto    */
                listT.add(tr);
            }
        } catch (Exception e) {
            
        }
        return listT;
    }
    
    public int SaveDetailsT(Transaction tran){
        String sql="insert into tran_x_prod (id_transaction, id_product, quantity_t) values(?,?,?)";
        try {
            con=cn.Connect();
            ps=con.prepareStatement(sql);
            ps.setInt(1, tran.getId());
            ps.setInt(2, tran.getMidproduct());
            ps.setInt(3, tran.getMquantity());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public List ReadDetailsT(){
        String sql = "select * from tran_x_prod";
        List<Transaction> listDt = new ArrayList<>();
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Transaction tr=new Transaction();
                tr.setMiduser(rs.getInt(2));
                tr.setSnumber(rs.getString(3));
                tr.setMdate(rs.getString(4));
                tr.setMstatusp(rs.getString(5));
                /*    espacio foto    */
                listDt.add(tr);
            }
        } catch (Exception e) {
            
        }
        return listDt;
    }
}
