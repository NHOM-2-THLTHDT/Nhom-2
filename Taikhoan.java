/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan7;
import java.util.Scanner;

/**
 *
 * @author ThankPad
 */
public class Taikhoan {
    private String soTaikhoan;
    private String chuTaikhoan;
    private double soDu;
    private String matKhau;
    public void setsoTaikhoan(String stk) {
        this.soTaikhoan = stk;
    }
    public String getsoTaikhoan() {
        return this.soTaikhoan;
    }
    public void setchuTaikhoan(String ctk) {
        this.chuTaikhoan = ctk;
    }
    public String getchuTaikhoan() {
        return this.chuTaikhoan;
    }
    public void setsoDu(double sd) {
        this.soDu = sd;
    }
    public double getsoDu() {
        return this.soDu;
    }
    public void setmatKhau(String mk) {
        this.matKhau = mk;
    }
    public String getmatKhau() {
        return this.matKhau;
    }
    public Taikhoan() {
        
    }
    public Taikhoan(String soTaikhoan, String chuTaikhoan, double soDu, String matKhau) {
        this.soTaikhoan = soTaikhoan;
        this.chuTaikhoan = chuTaikhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }
    public Taikhoan(Taikhoan tk) {
        this.soTaikhoan = tk.soTaikhoan;
        this.chuTaikhoan = tk.chuTaikhoan;
        this.soDu = tk.soDu;
        this.matKhau = tk.matKhau;
    }
    public void doiMatkhau() {
        String mk1,mk2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mat khau moi: ");
        mk1 = sc.nextLine();
        System.out.println("Nhap lại mat khau: ");
        mk2 = sc.nextLine();
        while(!mk1.equals(mk2)) {
            System.out.println("khong trung khop, vui long nhap lai: ");
            mk2 = sc.nextLine();
        }
        this.setmatKhau(mk2);
    }
    public void xuat() {
        System.out.println("STK                 :  " + this.soTaikhoan);
        System.out.println("Chu tai khoan       :  " + this.chuTaikhoan);
        System.out.println("So du               :  " + this.soDu);
        System.out.println("Mat khau hien tai   :  " + this.matKhau);
    }
}
 