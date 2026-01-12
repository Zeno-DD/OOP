/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vuhuy
 */
public class phoThong extends veBay{
    double khoiLuongHanhLy;

    public phoThong() {
    }

    public phoThong(int maVe, String hoTen, double giaVe, double khoiLuongHanhLy) {
        super(maVe, hoTen, giaVe);
        this.khoiLuongHanhLy = khoiLuongHanhLy;
    }

    public double getKhoiLuongHanhLy() {
        return khoiLuongHanhLy;
    }

    public void setKhoiLuongHanhLy(double khoiLuongHanhLy) {
        this.khoiLuongHanhLy = khoiLuongHanhLy;
    }

    @Override
    public String toString() {
        return super.toString() + "khoiLuongHanhLy=" + khoiLuongHanhLy + '}';
    }
    
    @Override
    public double giaBan(){
        return giaVe+phiSanBay+(khoiLuongHanhLy*50000);
    }
}
