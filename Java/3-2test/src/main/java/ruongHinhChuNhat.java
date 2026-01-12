/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vuhuy
 */
public class ruongHinhChuNhat extends ruong{
    double chieuDai;
    double chieuRong;

    public ruongHinhChuNhat() {
    }

    public ruongHinhChuNhat(double chieuDai, double chieuRong, int maRuong, String tenChuHo, String loaiCayTrong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return super.toString() + "ruongHinhChuNhat{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }
    @Override 
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
}
