/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class nhanVienBep extends nhanVien{
    boolean isBepTruong;
    double thuongChucVu;

    public nhanVienBep() {
    }

    public nhanVienBep(boolean isBepTruong, double thuongChucVu, String hoTen, int thamNien, String queQuan, int soGioLamViec) {
        super(hoTen, thamNien, queQuan, soGioLamViec);
        this.isBepTruong = isBepTruong;
        this.thuongChucVu = thuongChucVu;
    }
    

    public boolean isIsBepTruong() {
        return isBepTruong;
    }

    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }

    public double getThuongChucVu() {
        return thuongChucVu;
    }

    public void setThuongChucVu(double thuongChucVu) {
        this.thuongChucVu = thuongChucVu;
    }
    
    @Override
    public double tinhLuong(){
        double Luong=soGioLamViec*luongGio;
        if(isBepTruong==true){
            Luong=Luong+thuongChucVu;
        }
        return Luong;
    }

    @Override
    public String toString() {
        return super.toString() + "nhanVienBep{" + "isBepTruong=" + isBepTruong + ", thuongChucVu=" + thuongChucVu + '}';
    }
    
    
}
