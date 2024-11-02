/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.congkiet;
import java.time.LocalDateTime;
/**
 *
 * @author ThankPad
 */
public class TAIKHOANTIETKIEM extends TAIKHOAN {
    private double laiSuat;

    public TAIKHOANTIETKIEM(double laiSuat, String stk, String chuTaiKhoan, double soDu, String mk) {
        super(stk, chuTaiKhoan, soDu, mk);
        this.laiSuat = laiSuat;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }
    
    public void RutTien(double tienRut) {
        if(tienRut > this.soDu) {
            System.out.println("So tien khong hop le!");
        } else {
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now);
            this.soDu -= tienRut;
            System.out.println("Rut thanh cong "+tienRut+" dong!");
            System.out.println("So du hien tai :"+this.soDu);
        }
    }
    
    public void KiemTraSoDu() {
        System.out.println("So tai khoan   :"+this.stk);
        System.out.println("Chu tai khoan :"+this.chuTaiKhoan);
        System.out.println("So du          :"+this.soDu);
    }
}
