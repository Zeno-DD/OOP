/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class nhanVienThuNgan extends nhanVien{
    boolean isBietNGoaiNgu;

    public nhanVienThuNgan() {
    }

    public nhanVienThuNgan(boolean isBietNGoaiNgu, String hoTen, int thamNien, String queQuan, int soGioLamViec) {
        super(hoTen, thamNien, queQuan, soGioLamViec);
        this.isBietNGoaiNgu = isBietNGoaiNgu;
    }

    public boolean isIsBietNGoaiNgu() {
        return isBietNGoaiNgu;
    }

    public void setIsBietNGoaiNgu(boolean isBietNGoaiNgu) {
        this.isBietNGoaiNgu = isBietNGoaiNgu;
    }
    
    @Override
    public double tinhLuong(){
        return soGioLamViec*luongGio;
    }

    @Override
    public String toString() {
        return super.toString() + "nhanVienThuNgan{" + "isBietNGoaiNgu=" + isBietNGoaiNgu + '}';
    }
}   
