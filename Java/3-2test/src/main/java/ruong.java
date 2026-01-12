/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vuhuy
 */
public class ruong {
    int maRuong;
    String tenChuHo;
    String loaiCayTrong;
    double dienTichMax=100;

    public ruong() {
    }

    public ruong(int maRuong, String tenChuHo, String loaiCayTrong) {
        this.maRuong = maRuong;
        this.tenChuHo = tenChuHo;
        this.loaiCayTrong = loaiCayTrong;
    }

    public int getMaRuong() {
        return maRuong;
    }

    public void setMaRuong(int maRuong) {
        this.maRuong = maRuong;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getLoaiCayTrong() {
        return loaiCayTrong;
    }

    public void setLoaiCayTrong(String loaiCayTrong) {
        this.loaiCayTrong = loaiCayTrong;
    }

    public double getDienTichMax() {
        return dienTichMax;
    }

    public void setDienTichMax(double dienTichMax) {
        this.dienTichMax = dienTichMax;
    }

    @Override
    public String toString() {
        return "maRuong=" + maRuong + ", tenChuHo=" + tenChuHo + ", loaiCayTrong=" + loaiCayTrong + ", dienTichMax=" + dienTichMax + '}';
    }
    
    public double tinhDienTich(){
        return 0;
    }
}
