/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class dienThoai extends hangHoa{
    double giaSimGhep;

    public dienThoai() {
    }

    public dienThoai(String tenHang, int maHang, double giaNhap, double giaBan, double giaSimGhep) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.giaSimGhep = giaSimGhep;
    }
    
    
    public dienThoai(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }

    public double getGiaSimGhep() {
        return giaSimGhep;
    }

    public void setGiaSimGhep(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }
    
    @Override
    public double loiNhuan(){
        return (this.giaBan-this.giaNhap)*(1-this.thuongBanHang)-this.giaSimGhep;
    }

    @Override
    public String toString() {
        return super.toString() + "dienThoai{" + "giaSimGhep=" + giaSimGhep + '}';
    }
    
    
}
