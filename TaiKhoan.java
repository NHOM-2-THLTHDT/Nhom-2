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
public class TaiKhoan {
    public String soTaiKhoan;
    public String chuTaiKhoan;
    public double soDu;
    private String matKhau;

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }
    
    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public void guiTien(double tienGui) {
        if(tienGui > 0){
            this.soDu += tienGui;
            System.out.println("da gui "+tienGui+", so du hien tai: "+this.soDu );
        }
        else
            System.out.println("tien gui phai lon hon 0!");
    }
    public void rutTien(double tienRut) {
        if(tienRut > this.soDu){
            System.out.println("so tien rut vuot qua so du!");
        }
        else {
            this.soDu -= tienRut;
            System.out.println("da rut "+ tienRut +", so du hien tai: "+this.soDu);
        }
    }
    public void kiemTraSoDu() {
        System.out.println("So du hien tai la: "+this.soDu);
    }
    public void doiMatKhau() {
        Scanner sc = new Scanner(System.in);
        String mkc,mkm,nl;
        do {
            System.out.print("Nhap mat khau cu :");
            mkc = sc.nextLine();
            if(!this.getMatKhau().equals(mkc))
                System.out.print("Sai! ");
        } while (!this.getMatKhau().equals(mkc));
        System.out.print("Nhap mat khau moi  :");
        mkm = sc.nextLine();
        do {
            System.out.print("Nhap lai mat khau moi :");
            nl = sc.nextLine();
            if(!mkm.equals(nl))
                System.out.print("Nhap sai,");
        } while (!mkm.equals(nl));
        this.matKhau = mkm;
        System.out.println("doi mat khau thanh cong!");
    }
}
