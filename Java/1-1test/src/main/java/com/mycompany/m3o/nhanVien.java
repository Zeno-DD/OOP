/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3o;

/**
 *
 * @author vuhuy
 */
public class nhanVien extends canBo {
    String nganhDaoTao;
    public nhanVien(String nganhDaoTao, String hoTenString, int namSinh, String gioiTinhString, double heSoLuong, double luongCoBan) {
        super(hoTenString, namSinh, gioiTinhString, heSoLuong, luongCoBan);
        this.nganhDaoTao = nganhDaoTao;
    }

    public nhanVien() {
    }
    
    @Override
    public double tinhLuong(){
        double Luong=heSoLuong*luongCoBan;
        return Luong;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public void display(){
    super.display();
    System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}