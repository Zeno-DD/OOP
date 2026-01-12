/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class thiSinh {
    String hoTen;
    int soBaoDanh;
    String truongHoc;
    double diemCong;
    double diemSan=3;

    public thiSinh() {
    }

    public thiSinh(String hoten, int soBaoDanh, String truongHoc, double diemCong) {
        this.hoTen = hoten;
        this.soBaoDanh = soBaoDanh;
        this.truongHoc = truongHoc;
        this.diemCong = diemCong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }

    public double getDiemCong() {
        return diemCong;
    }

    public void setDiemCong(double diemCong) {
        this.diemCong = diemCong;
    }

    public double getDiemSan() {
        return diemSan;
    }

    public void setDiemSan(double diemSan) {
        this.diemSan = diemSan;
    }
    public double tinhDiem(){
        return 0;
    }

    public String toString() {
        return "thiSinh{" + "hoten=" + hoTen + ", soBaoDanh=" + soBaoDanh + ", truongHoc=" + truongHoc + ", diemCong=" + diemCong + ", diemSan=" + diemSan + '}';
    }
    
}
