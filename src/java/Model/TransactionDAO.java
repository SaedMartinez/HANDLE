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
        String sql = "SELECT t_transaction.id_transaction, t_transaction.serial_number, t_transaction.date, t_user.name, t_user.id_user FROM t_transaction INNER JOIN t_user ON t_transaction.id_user=t_user.id_user";
        List<Transaction> listH = new ArrayList<>();
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Transaction tr=new Transaction();
                tr.setId(rs.getInt(1));
                tr.setSnumber(rs.getString(2));
                tr.setMdate(rs.getString(3));
                tr.setMnameuser(rs.getString(4));
                tr.setMiduser(rs.getInt(5));
                /*    espacio foto    */
                listH.add(tr);
            }
        } catch (Exception e) {    
        }
        return listH;
    }
    
    public Transaction ReadTransactionId(int id){
        Transaction tr=new Transaction();
        String sql = "SELECT t_transaction.id_transaction, t_transaction.serial_number, t_transaction.date, t_user.name, t_user.id_user FROM t_transaction INNER JOIN t_user ON t_transaction.id_user=t_user.id_user WHERE t_transaction.id_transaction="+id;
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tr.setId(rs.getInt(1));
                tr.setSnumber(rs.getString(2));
                tr.setMdate(rs.getString(3));
                tr.setMnameuser(rs.getString(4));
                tr.setMiduser(rs.getInt(5));
            }
        } catch (Exception e) {    
        }
        return tr;
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
    
    public List ReadDetailsT(int id){
        String sql = "SELECT tran_x_prod.quantity_t, t_product.id_product, t_product.name FROM tran_x_prod INNER JOIN t_product ON tran_x_prod.id_product=t_product.id_product WHERE tran_x_prod.id_transaction="+id;
        List<Transaction> listDt = new ArrayList<>();
        try {
            con = cn.Connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Transaction tr=new Transaction();
                tr.setMquantity(rs.getInt(1));
                tr.setMidproduct(rs.getInt(2));
                tr.setMnamep(rs.getString(3));
                /*    espacio foto    */
                listDt.add(tr);
            }
        } catch (Exception e) { 
        }
        return listDt;
    }
}
