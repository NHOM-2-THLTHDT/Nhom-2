/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHAHANG;
import java.util.HashMap;

/**
 *
 * @author ThankPad
 */
public class DON {
    public String maHD;
    public String maKH;
    public String TrangThai;
    public int soBan;
    HashMap<String,MON> dsmon = new HashMap<String,MON>();

    public DON() {
        this.TrangThai = "chua thanh toan";
    }
    
    public void goiMon(MON mon) {
        dsmon.put(mon.getTenMon(),mon);
    }
    
    public void huyMon(String tenMon) {
        dsmon.remove(tenMon);
    }
    
    public double TongTien() {
        double s = 0;
        for (MON value : dsmon.values()) {
            s += value.getGiaBan();
        }
        return s;
    } 
    
    public void INHD() {
        System.out.println("Cac mon da goi: ");
        for(MON value : dsmon.values()) {
            System.out.printf("%-30s %fVND\n",value.getTenMon(),value.getGiaBan());
        }
    }
    
    public void ThanhToan(KHACHHANG kh) {
        this.INHD();
        if(kh.getVIP() == 0) {
            kh.setTienTichLuy(kh.getTienTichLuy() + this.TongTien());
            System.out.println("Tong tien: " + this.TongTien()+"VND");
        }
        else {
            System.out.println("Vi quy khach da su dung tren 10000000VND nen quy khach la khach VIP cua chung toi, hoa don duoc giam 10%!");
            System.out.println("Tong tien: " + this.TongTien()*0.9+"VND");
            kh.setTienTichLuy(kh.getTienTichLuy() + this.TongTien()*0.9);
        }
        this.setTrangThai("Da thanh toan");
        if (kh.getTienTichLuy() >= 10000000)
            kh.setVIP(1);
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    
}
