/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vuhuy
 */
public class veBay {
    int maVe;
    String hoTen;
    double giaVe;
    double phiSanBay=250000;

    public veBay() {
    }

    public veBay(int maVe, String hoTen, double giaVe) {
        this.maVe = maVe;
        this.hoTen = hoTen;
        this.giaVe = giaVe;
    }

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public double getPhiSanBay() {
        return phiSanBay;
    }

    public void setPhiSanBay(double phiSanBay) {
        this.phiSanBay = phiSanBay;
    }

    public String toString() {
        return "maVe=" + maVe + ", hoTen=" + hoTen + ", giaVe=" + giaVe + ", phiSanBay=" + phiSanBay + '}';
    }
    public double giaBan(){
        return 0;
    }
    
}
