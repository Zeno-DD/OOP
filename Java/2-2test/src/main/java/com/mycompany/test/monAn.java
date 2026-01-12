/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class monAn extends matHang{
    boolean canTrinhDien;

    public monAn() {
    }

    public monAn(String tenMatHang, int maHang, int soLuong, double giaVon, boolean canTrinhDien) {
        super(tenMatHang, maHang, soLuong, giaVon);
        this.canTrinhDien = canTrinhDien;
    }

    public boolean isCanTrinhDien() {
        return canTrinhDien;
    }

    public void setCanTrinhDien(boolean canTrinhDien) {
        this.canTrinhDien = canTrinhDien;
    }

    @Override
    public String toString() {
        return super.toString() + "monAn{" + "canTrinhDien=" + canTrinhDien + '}';
    }
    
    @Override
    public double tinhGia(){
        double giaCoBan = this.giaVon/tyLeGiaVon;
        if (this.canTrinhDien) {
            return giaCoBan + 200000;
        }
        return giaCoBan;
    }

}
