/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vuhuy
 */
public class ruongVuong extends ruong{
    double doDaiCanh;

    public ruongVuong() {
    }

    public ruongVuong(int maRuong, String tenChuHo, String loaiCayTrong, double doDaiCanh) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.doDaiCanh = doDaiCanh;
    }

    public double getDoDaiCanh() {
        return doDaiCanh;
    }

    public void setDoDaiCanh(double doDaiCanh) {
        this.doDaiCanh = doDaiCanh;
    }

    @Override
    public String toString() {
        return super.toString() + "ruongVuong{" + "doDaiCanh=" + doDaiCanh + '}';
    }
    
    @Override 
    public double tinhDienTich(){
        return this.doDaiCanh*this.doDaiCanh;
    }
}
