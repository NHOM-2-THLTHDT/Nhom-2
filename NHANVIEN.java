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
public class NHANVIEN extends USER{
    HashMap<Double,String> danhgia = new HashMap<Double,String>();

    public NHANVIEN(String tenDN, String pass, String ten, int tuoi, int gioiTinh, String sdt) {
        super(tenDN, pass, ten, tuoi, gioiTinh, sdt);
    }
    
    public void themDanhGia(double sao, String feedback) {
        danhgia.put(sao, feedback);
    }
    
    public void XemDanhGia() {
        System.out.println("Cac danh gia: ");
        for(String value : danhgia.values()) {
            System.out.println(value);
        }
        System.out.printf("Ban duoc danh gia %.1f sao\n",this.TrungBinhSao());
    }
    
    public double TrungBinhSao() {
        double s=0;
        for(double key : danhgia.keySet())
            s += key;
        return s/danhgia.size();
    }
}
