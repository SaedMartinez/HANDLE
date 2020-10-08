package Model;


public class Transaction {
    
    Integer id;
    String snumber;
    String mdate;
    Integer item;
    Integer miduser;
    String mnameuser;
    Integer midproduct;
    String mnamep;
    Integer mquantity;
    String mstatusp;

    public Transaction() {
    }

    public Transaction(Integer id, String snumber, String mdate, Integer item, Integer miduser, String mnameuser, Integer midproduct, String mnamep, Integer mquantity, String mstatusp) {
        this.id = id;
        this.snumber = snumber;
        this.mdate = mdate;
        this.item = item;
        this.miduser = miduser;
        this.mnameuser = mnameuser;
        this.midproduct = midproduct;
        this.mnamep = mnamep;
        this.mquantity = mquantity;
        this.mstatusp = mstatusp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
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

    public String getMnameuser() {
        return mnameuser;
    }

    public void setMnameuser(String mnameuser) {
        this.mnameuser = mnameuser;
    }

    public Integer getMidproduct() {
        return midproduct;
    }

    public void setMidproduct(Integer midproduct) {
        this.midproduct = midproduct;
    }

    public String getMnamep() {
        return mnamep;
    }

    public void setMnamep(String mnamep) {
        this.mnamep = mnamep;
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
