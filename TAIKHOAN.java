/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.congkiet;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author ThankPad
 */
abstract public class TAIKHOAN {
    protected String stk;
    protected String chuTaiKhoan;
    protected double soDu;
    private String mk;

    public TAIKHOAN(String stk, String chuTaiKhoan, double soDU, String mk) {
        this.stk = stk;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDU;
        this.mk = mk;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDU(double soDu) {
        this.soDu = soDu;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
    
    abstract void RutTien(double tienRut);
    
    void GuiTien(double tienGui) {
        if(tienGui > 0) {
            this.soDu += tienGui;
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now);
            System.out.println("Da gui "+tienGui+" vao stk: "+this.stk);
            System.out.println("So du hien tai: "+this.soDu);
        } else
            System.out.println("So tien khong hop le!");
    }
    
    abstract void KiemTraSoDu();
    
    void KhoaTaiKhoan(int dem) {
        for (int i = 0; i < dem; i++) {
            try {
                System.out.println("Con " + (dem - i) + " giay...");
                Thread.sleep(1000); // Tạm dừng 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    void DangNhap() {
        Scanner sc = new Scanner(System.in);
        String stkCheck;
        String passCheck;
        int soLanSai=0,dem=30;
        do {
            System.out.println("Nhap so tai khoan:");
            stkCheck = sc.nextLine();
            System.out.println("Nhap mat khau    :");
            passCheck = sc.nextLine();

            if (stkCheck.equals(this.stk) && passCheck.equals(this.getMk())) {
                System.out.println("Dang nhap thanh cong!");
            } else {
                soLanSai++;
                if (soLanSai == 3) {
                    System.out.println("Ban nhap sai qua nhieu lan! Doi " + dem + " giay.");
                    this.KhoaTaiKhoan(dem);
                    dem += 30; // Tăng thời gian đợi cho lần khóa tiếp theo
                    soLanSai = 0;
                } else {
                    System.out.println("Sai so tai khoan hoac mat khau, vui long nhap lai!");
                }
            }
        } while ((!stkCheck.equals(this.stk) || !passCheck.equals(this.getMk())));
    }
}
