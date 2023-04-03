package com.helloworld.entities.properties;

public class HoTen {
    private String ho;

    private String ten_dem;

    private String ten;

    public HoTen(String ho, String ten_dem, String ten) {
        this.ho = ho;
        this.ten_dem = ten_dem;
        this.ten = ten;
    }

    public String getHo() {
        return this.ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen_dem() {
        return this.ten_dem;
    }

    public void setTen_dem(String ten_dem) {
        this.ten_dem = ten_dem;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // public boolean equals(String hoten) {
    // return hoten.contains(ten) && hoten.contains(ho) && hoten.contains(ten_dem);
    // }

    @Override
    public String toString() {
        return getHo()
                + " " + getTen_dem()
                + " " + getTen();
    }
}
