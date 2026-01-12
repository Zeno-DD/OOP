/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3o;

/**
 *
 * @author vuhuy
 */
public class quanLy extends canBo {
    double heSoChucVu;

    public quanLy(double heSoChucVu, String hoTenString, int namSinh, String gioiTinhString, double heSoLuong, double luongCoBan) {
        super(hoTenString, namSinh, gioiTinhString, heSoLuong, luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }

    public quanLy() {
    }
    
    
    public double getQuanLyChucVu() {
        return heSoChucVu;
    }

    public void setQuanLyChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }
    @Override
    public double tinhLuong(){
        double Luong=heSoLuong*luongCoBan*(1+heSoChucVu);
        return Luong;
    }
    @Override
    public void display(){
    super.display();
    System.out.println("Quan ly chuc vu: " + heSoChucVu);
    }
}
