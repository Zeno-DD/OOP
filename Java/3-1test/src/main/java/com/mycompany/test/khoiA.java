/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author vuhuy
 */
public class khoiA extends thiSinh{
    double diemToan;
    double diemLy;
    double diemHoa;

    public khoiA() {
    }

    public khoiA(String hoten, int soBaoDanh, String truongHoc, double diemCong, double diemToan, double diemLy, double diemHoa) {
        super(hoten, soBaoDanh, truongHoc, diemCong);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return super.toString() + "khoiA{" + "diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + '}';
    }
    
    @Override
    public double tinhDiem(){
        return (this.diemToan*2+this.diemLy+this.diemHoa)/4+this.diemCong;
    }
}
