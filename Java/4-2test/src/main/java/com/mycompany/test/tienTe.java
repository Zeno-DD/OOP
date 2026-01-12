/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class tienTe extends matHang{
    double tyGiaChuyenDoi;

    public tienTe() {
    }

    public tienTe(int maHang, String tenHang, boolean duocPhepMuaBan, double tyGiaChuyenDoi) {
        super(maHang, tenHang, duocPhepMuaBan);
        this.tyGiaChuyenDoi = tyGiaChuyenDoi;
    }

    public double getTyGiaChuyenDoi() {
        return tyGiaChuyenDoi;
    }

    public void setTyGiaChuyenDoi(double tyGiaChuyenDoi) {
        this.tyGiaChuyenDoi = tyGiaChuyenDoi;
    }

    @Override
    public String toString() {
        return "tienTe{" + "tyGiaChuyenDoi=" + tyGiaChuyenDoi + '}';
    }
    
}
