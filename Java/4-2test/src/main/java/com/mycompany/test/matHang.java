/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public abstract class matHang {
    int maHang;
    String tenHang;
    boolean duocPhepMuaBan;

    public matHang() {
    }

    public matHang(int maHang, String tenHang, boolean duocPhepMuaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.duocPhepMuaBan = duocPhepMuaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public boolean isDuocPhepMuaBan() {
        return duocPhepMuaBan;
    }

    public void setDuocPhepMuaBan(boolean duocPhepMuaBan) {
        this.duocPhepMuaBan = duocPhepMuaBan;
    }
    public abstract String toString();
}
