
package Modelo;

public class Usuario {

    int mid_user;
    String mname;
    String muser;
    String mpass;
    String mdescription;
    
    public Usuario() {
    }

    public Usuario(int mid_user, String mname, String muser, String mpass, String mdescription) {
        this.mid_user = mid_user;
        this.mname = mname;
        this.muser = muser;
        this.mpass = mpass;
        this.mdescription = mdescription;
    }

    public int getMid_user() {
        return mid_user;
    }

    public void setMid_user(int mid_user) {
        this.mid_user = mid_user;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMuser() {
        return muser;
    }

    public void setMuser(String muser) {
        this.muser = muser;
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }
    
}
