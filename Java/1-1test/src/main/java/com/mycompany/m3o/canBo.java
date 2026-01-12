/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3o;

/**
 *
 * @author vuhuy
 */
public class canBo {
    String hoTen;
    int namSinh;
    String gioiTinh;
    String diaChi;
    double heSoLuong;
    double luongCoBan=2000000;
    String thuocTinhCon;
    public canBo(String hoTenString, int namSinh, String gioiTinhString, double heSoLuong, double luongCoBan){
        this.hoTen=hoTen;
        this.namSinh=namSinh;
        this.gioiTinh=gioiTinh;
        this.diaChi=diaChi;
        this.heSoLuong=heSoLuong;
    }

    public canBo() {
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getThuocTinhCon() {
        return thuocTinhCon;
    }

    public void setThuocTinhCon(String thuocTinhCon) {
        this.thuocTinhCon = thuocTinhCon;
    }
    
    public void display(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Ho ten: " + heSoLuong);
    }
    public double tinhLuong(){
        return 0;
    }
    
}

