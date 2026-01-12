/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class mayTinhBang extends hangHoa{
    double kichThuocManHinh;

    public mayTinhBang() {
    }

    public mayTinhBang(String tenHang, int maHang, double giaNhap, double giaBan, double kichThuocManHinh) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.kichThuocManHinh = kichThuocManHinh;
    }
    
    public mayTinhBang(double kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public double getKichThuocManHinh() {
        return kichThuocManHinh;
    }

    public void setKichThuocManHinh(double kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    @Override
    public String toString() {
        return super.toString() + "mayTinhBang{" + "kichThuocManHinh=" + kichThuocManHinh + '}';
    }
    
    @Override
    public double loiNhuan(){
        return (this.giaBan-this.giaNhap)*(1-this.thuongBanHang);
    }
}
