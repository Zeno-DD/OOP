/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class trangSuc extends matHang{
    double giaTheoCan;

    public trangSuc() {
    }

    public trangSuc(int maHang, String tenHang, boolean duocPhepMuaBan, double giaTheoCan) {
        super(maHang, tenHang, duocPhepMuaBan);
        this.giaTheoCan = giaTheoCan;
    }

    public double getGiaTheoCan() {
        return giaTheoCan;
    }

    public void setGiaTheoCan(double giaTheoCan) {
        this.giaTheoCan = giaTheoCan;
    }

    @Override
    public String toString() {
        return "trangSuc{" + "giaTheoCan=" + giaTheoCan + '}';
    }
    
}
