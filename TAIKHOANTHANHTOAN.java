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
public class TAIKHOANTHANHTOAN extends TAIKHOAN {
    private double thauChi;

    public TAIKHOANTHANHTOAN(double thauChi, String stk, String chuTaiKhoan, double soDu, String mk) {
        super(stk, chuTaiKhoan, soDu, mk);
        this.thauChi = thauChi;
    }

    public double getThauChi() {
        return thauChi;
    }

    public void setThauChi(double thauChi) {
        this.thauChi = thauChi;
    }
    
    public void RutTien(double tienRut) {
        if(tienRut > this.soDu+this.getThauChi()) {
            System.out.println("So tien rut khong hop le!");
        } else {
            if(tienRut > this.soDu) {
                this.soDu -= tienRut;
                this.setThauChi((this.getThauChi()+this.soDu));
            } else
                this.soDu -= tienRut;
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now);
            System.out.println("Rut thanh cong "+tienRut+" dong!");
            System.out.println("So du hien tai :"+this.soDu);
        }
    }
    
    public void KiemTraSoDu() {
        System.out.println("So tai khoan   :"+this.stk);
        System.out.println("Chu tai khoan :"+this.chuTaiKhoan);
        System.out.println("So du          :"+this.soDu);
        System.out.println("Muc thau chi   :"+this.thauChi);
    }
}

