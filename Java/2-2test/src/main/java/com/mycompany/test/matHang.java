/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class matHang {
    String tenMatHang;
    int maHang;
    int soLuong;
    double giaVon;
    double tyLeGiaVon=0.4;

    public matHang() {
    }

    public matHang(String tenMatHang, int maHang, int soLuong, double giaVon) {
        this.tenMatHang = tenMatHang;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.giaVon = giaVon;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(double giaVon) {
        this.giaVon = giaVon;
    }

    public double getTyLeGiaVon() {
        return tyLeGiaVon;
    }

    public void setTyLeGiaVon(double tyLeGiaVon) {
        this.tyLeGiaVon = tyLeGiaVon;
    }
    public double tinhGia(){
        return 0;
    }

    public String toString() {
        return "matHang{" + "tenMatHang=" + tenMatHang + ", maHang=" + maHang + ", soLuong=" + soLuong + ", giaVon=" + giaVon + ", tyLeGiaVon=" + tyLeGiaVon + '}';
    }
    
}
