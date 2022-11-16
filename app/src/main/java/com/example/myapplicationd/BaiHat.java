package com.example.myapplicationd;

public class BaiHat {
    int id_bh;
    String ten_bh;
    int id_ns;
    String ten_ns;

    public BaiHat(int id_bh, String ten_bh, int id_ns, String ten_ns) {
        this.id_bh = id_bh;
        this.ten_bh = ten_bh;
        this.id_ns = id_ns;
        this.ten_ns = ten_ns;
    }

    public int getId_bh() {
        return id_bh;
    }

    public void setId_bh(int id_bh) {
        this.id_bh = id_bh;
    }

    public String getTen_bh() {
        return ten_bh;
    }

    public void setTen_bh(String ten_bh) {
        this.ten_bh = ten_bh;
    }

    public int getId_ns() {
        return id_ns;
    }

    public void setId_ns(int id_ns) {
        this.id_ns = id_ns;
    }

    public String getTen_ns() {
        return ten_ns;
    }

    public void setTen_ns(String ten_ns) {
        this.ten_ns = ten_ns;
    }
}
