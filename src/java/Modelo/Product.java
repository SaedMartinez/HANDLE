package Modelo;

import java.io.InputStream;

public class Product {
    
    int mid_producto;
    String mname;
    String mdescription;
    int mq_stock;
    InputStream mphoto;
    int mid_category;

    public Product() {
    }

    public Product(int mid_producto, String mname, String mdescription, int mq_stock, InputStream mphoto, int mid_category) {
        this.mid_producto = mid_producto;
        this.mname = mname;
        this.mdescription = mdescription;
        this.mq_stock = mq_stock;
        this.mphoto = mphoto;
        this.mid_category = mid_category;
    }

    public int getMid_producto() {
        return mid_producto;
    }

    public void setMid_producto(int mid_producto) {
        this.mid_producto = mid_producto;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }

    public int getMq_stock() {
        return mq_stock;
    }

    public void setMq_stock(int q_stock) {
        this.mq_stock = q_stock;
    }

    public InputStream getMphoto() {
        return mphoto;
    }

    public void setMphoto(InputStream photo) {
        this.mphoto = photo;
    }

    public int getMid_category() {
        return mid_category;
    }

    public void setMid_category(int mid_category) {
        this.mid_category = mid_category;
    }

        
    
}

