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
public class DSDON {
    HashMap<String,DON> dsdon = new HashMap<String,DON>();

    public DSDON() {
    }
    
    public void ThemDon(DON don) {
        dsdon.put(don.getMaHD(), don);
    }
    
    public void XoaDon(String sohd) {
        dsdon.remove(sohd);
    }
    
    public void inDonALL() {
        for(DON value : dsdon.values()) {
            System.out.println("Ma hoa don   : "+value.getMaHD());
            System.out.println("Ma khach hang: "+value.getMaKH());
            System.out.println("Trang thai   : "+value.getTrangThai());
            value.INHD();
            System.out.println("Tong tien: "+value.TongTien());
        }
    }
    
    public void inDonKH(String maKH) {
        for(DON value : dsdon.values()) {
            if(maKH.equals(value.getMaKH())) {
            System.out.println("Ma hoa don   : "+value.getMaHD());
            System.out.println("Ma khach hang: "+value.getMaKH());
            System.out.println("Trang thai   : "+value.getTrangThai());
            value.INHD();
            System.out.println("Tong tien: "+value.TongTien());
            }
        }
    }
    
    public boolean TonTai(String maDH) {
        for(String key : dsdon.keySet()) {
            if(key.equals(maDH))
                return true;
        }
        return false;
    }
}
