/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHAHANG;
import java.util.Scanner;
/**
 *
 * @author ThankPad
 */
public class KHACHHANG extends USER implements IDANHGIA {
    private int VIP;
    private double TienTichLuy;

    public KHACHHANG(int VIP, double TienTichLuy, String tenDN, String pass, String ten, int tuoi, int gioiTinh, String sdt) {
        super(tenDN, pass, ten, tuoi, gioiTinh, sdt);
        this.VIP = VIP;
        this.TienTichLuy = TienTichLuy;
    }

    public int getVIP() {
        return VIP;
    }

    public void setVIP(int VIP) {
        this.VIP = VIP;
    }

    public double getTienTichLuy() {
        return TienTichLuy;
    }

    public void setTienTichLuy(double TienTichLuy) {
        this.TienTichLuy = TienTichLuy;
    }

    public void vietDanhGia( NHANVIEN nv) {
        Scanner sc = new Scanner(System.in);
        double sao;
        String comment;
        System.out.println("Danh gia cua ban: ");
        comment = sc.nextLine();
        System.out.println("Ban cho nhan vien nay may sao(1->5):");
        sao = sc.nextDouble();
        sc.nextLine();
        System.out.println("Xin cam on.");
        nv.themDanhGia(sao, comment);
    }
}
