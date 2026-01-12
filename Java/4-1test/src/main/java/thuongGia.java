/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vuhuy
 */
public class thuongGia extends veBay{
    boolean dichVuPhongCho;
    double heSoSangTrong;

    public thuongGia() {
    }

    public thuongGia(int maVe, String hoTen, double giaVe, boolean dichVuPhongCho, double heSoSangTrong) {
        super(maVe, hoTen, giaVe);
        this.dichVuPhongCho = dichVuPhongCho;
        this.heSoSangTrong = heSoSangTrong;
    }

    public boolean isDichVuPhongCho() {
        return dichVuPhongCho;
    }

    public void setDichVuPhongCho(boolean dichVuPhongCho) {
        this.dichVuPhongCho = dichVuPhongCho;
    }

    public double getHeSoSangTrong() {
        return heSoSangTrong;
    }

    public void setHeSoSangTrong(double heSoSangTrong) {
        this.heSoSangTrong = heSoSangTrong;
    }

    @Override
    public String toString() {
        return super.toString() + "dichVuPhongCho=" + dichVuPhongCho + ", heSoSangTrong=" + heSoSangTrong + '}';
    }
    
    @Override
    public double giaBan(){
        double giaBan=this.giaVe*this.heSoSangTrong+this.phiSanBay;
        if(isDichVuPhongCho()){
            giaBan=giaBan+500000;
        }
        return giaBan;
    }
}

    