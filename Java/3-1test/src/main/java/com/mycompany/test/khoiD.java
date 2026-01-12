/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class khoiD extends thiSinh{
    double diemToan;
    double diemVan;
    double diemAnh;

    public khoiD() {
    }

    public khoiD(String hoten, int soBaoDanh, String truongHoc, double diemCong, double diemToan, double diemVan, double diemAnh) {
        super(hoten, soBaoDanh, truongHoc, diemCong);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    @Override
    public String toString() {
        return super.toString() + "khoiD{" + "diemToan=" + diemToan + ", diemVan=" + diemVan + ", diemAnh=" + diemAnh + '}';
    }
   
    @Override
    public double tinhDiem(){
        return (diemToan+diemVan+diemAnh*2)/4+diemCong;
    }
}
