/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class doUong extends matHang{
    boolean coNongKhong;

    public doUong() {
    }

    public doUong(String tenMatHang, int maHang, int soLuong, double giaVon, boolean coNongKhong) {
        super(tenMatHang, maHang, soLuong, giaVon);
        this.coNongKhong = coNongKhong;
    }

    public boolean isCoNongKhong() {
        return coNongKhong;
    }

    public void setCoNongKhong(boolean coNongKhong) {
        this.coNongKhong = coNongKhong;
    }
    
    @Override
    public double tinhGia(){
        return (this.giaVon/tyLeGiaVon);
    }

    @Override
    public String toString() {
        return super.toString() + "doUong{" + "coNongKhong=" + coNongKhong + '}';
    }
}
