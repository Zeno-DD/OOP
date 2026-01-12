/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class hangHoa {
    String tenHang;
    int maHang;
    double giaNhap;
    double giaBan;
    double thuongBanHang=0.2;

    public hangHoa() {
    }

    public hangHoa(String tenHang, int maHang, double giaNhap, double giaBan) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThuongBanHang() {
        return thuongBanHang;
    }

    public void setThuongBanHang(double thuongBanHang) {
        this.thuongBanHang = thuongBanHang;
    }

    public String toString() {
        return "hangHoa{" + "tenHang=" + tenHang + ", maHang=" + maHang + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", thuongBanHang=" + thuongBanHang + '}';
    }
    
    public double loiNhuan(){
        return 0;
    }
}
