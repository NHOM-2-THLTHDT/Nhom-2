/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Windowns 10
 */
import java.util.Scanner;
public class TaiKhoan {
    public String soTaiKhoan;
    public String chuTaiKhoan;
    public double soDu;
    private String matKhau;

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String maKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = maKhau;
    }


    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String maKhau) {
        this.matKhau = maKhau;
    }
    public void guiTien(double tienGui){
        if(tienGui>0) {
            this.soDu += tienGui;
            System.out.println("So tien da gui la: "+tienGui+", So du hien tai: "+this.soDu);
        }
        else{
            System.out.println("Tien gui phai lon hon 0!");
        }
    }
    public void rutTien(double tienRut){
        if(tienRut<=this.soDu){
            this.soDu -= tienRut;
            System.out.println("So tien da rut la: "+tienRut+" So du hien tai: "+this.soDu);
        }
        else{
            System.out.println("So du hien tai khong du!");
        }
    }
    public void kiemTraSoDu(){
        System.out.println("So du hien tai: "+this.soDu);
    }
    public void doiMatKhau(){
        Scanner sc= new Scanner(System.in);
        String matKhauCu, matKhauMoi, nhapLai;
        do{
            System.out.print("Nhap mat khau cu: ");
            matKhauCu=sc.nextLine();
            if(!this.getMatKhau().equals(matKhauCu))
                System.out.print("Nhap sai! ");
        }while(!this.getMatKhau().equals(matKhauCu));
        System.out.print("Nhap mat khau moi: ");
        matKhauMoi=sc.nextLine();
        do{
            System.out.print("Nhap lai mat khau moi: ");
            nhapLai=sc.nextLine();
            if(!matKhauMoi.equals(nhapLai))
                   System.out.print("Nhap sai!  ");
        }while(!matKhauMoi.equals(nhapLai));
        this.matKhau=matKhauMoi;
        System.out.print("Doi mat khau thanh cong!");
    }
}

