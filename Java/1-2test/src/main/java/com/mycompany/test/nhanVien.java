/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class nhanVien {
    String hoTen;
    int thamNien;
    String queQuan;
    int soGioLamViec;
    double luongGio=100000;

    public nhanVien() {
    }

    public nhanVien(String hoTen, int thamNien, String queQuan, int soGioLamViec) {
        this.hoTen = hoTen;
        this.thamNien = thamNien;
        this.queQuan = queQuan;
        this.soGioLamViec = soGioLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public double getLuongGio() {
        return luongGio;
    }

    public void setLuongGio(double luongGio) {
        this.luongGio = luongGio;
    }
    
    public double tinhLuong(){
        return 0;
    }

    public String toString() {
        return "nhanVien{" + "hoTen=" + hoTen + ", thamNien=" + thamNien + ", queQuan=" + queQuan + ", soGioLamViec=" + soGioLamViec + ", luongGio=" + luongGio + '}';
    }
}
