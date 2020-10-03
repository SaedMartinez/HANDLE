package Model;


public class Transaction {
    
    Integer id;
    Integer item;
    Integer miduser;
    Integer midproduct;
    String snumber;
    String mnamep;
    String mdate;
    Integer mquantity;
    String mstatusp;

    public Transaction() {
    }

    public Transaction(Integer id, Integer item, Integer miduser, Integer midproduct, String snumber, String mnamep, String mdate, Integer mquantity, String mstatusp) {
        this.id = id;
        this.item = item;
        this.miduser = miduser;
        this.midproduct = midproduct;
        this.snumber = snumber;
        this.mnamep = mnamep;
        this.mdate = mdate;
        this.mquantity = mquantity;
        this.mstatusp = mstatusp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getMiduser() {
        return miduser;
    }

    public void setMiduser(Integer miduser) {
        this.miduser = miduser;
    }

    public Integer getMidproduct() {
        return midproduct;
    }

    public void setMidproduct(Integer midproduct) {
        this.midproduct = midproduct;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getMnamep() {
        return mnamep;
    }

    public void setMnamep(String mnamep) {
        this.mnamep = mnamep;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public Integer getMquantity() {
        return mquantity;
    }

    public void setMquantity(Integer mquantity) {
        this.mquantity = mquantity;
    }

    public String getMstatusp() {
        return mstatusp;
    }

    public void setMstatusp(String mstatusp) {
        this.mstatusp = mstatusp;
    }

    
    
}
