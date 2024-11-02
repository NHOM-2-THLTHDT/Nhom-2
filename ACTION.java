/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.congkiet;
import java.util.Scanner;
/**
 *
 * @author ThankPad
 */
public class ACTION {
    Scanner sc = new Scanner(System.in);
   
    public ACTION() {
    }
    
    void TinhLaiSuat(double laiSuat,double tienTietKiem) {
        double result = tienTietKiem *(100+laiSuat)/100;
        System.out.println("Lai suat la "+laiSuat+"%/nam");
        System.out.println("Voi so tien tiet kiem cua ban, sau 1 nam se nhan duoc "+result+"dong");
    }
    
    void DoSomeThing(TAIKHOANTIETKIEM tk) {
        String option;
        tk.DangNhap();
        tk.KiemTraSoDu();
        System.out.println("1.RUT TIEN");
        System.out.println("2.GUI TIEN");
        System.out.println("3.TINH LAI SUAT");
        option = sc.nextLine();
        switch(option) {
            case "1" :
                double tienRut;
                System.out.println("Nhap so tien can rut :");
                tienRut = sc.nextDouble();
                sc.nextLine();
                tk.RutTien(tienRut);
                break;
            case "2" :
                double tienGui;
                System.out.println("Nhap so tien can gui :");
                tienGui = sc.nextDouble();
                sc.nextLine();
                tk.GuiTien(tienGui);
                break;
            case "3" :
                this.TinhLaiSuat(tk.getLaiSuat(),tk.soDu);
                break;
            default  :
                System.out.println("Lua chon khong hop le!");
                break;
        }
    }
    
    void DoSomeThing(TAIKHOANTHANHTOAN tk) {
        String option;
        tk.DangNhap();
        tk.KiemTraSoDu();
        System.out.println("1.RUT TIEN");
        System.out.println("2.GUI TIEN");
        option = sc.nextLine();
        switch(option) {
            case "1" :
                double tienRut;
                System.out.println("Nhap so tien can rut :");
                tienRut = sc.nextDouble();
                sc.nextLine();
                tk.RutTien(tienRut);
                break;
            case "2" :
                double tienGui;
                System.out.println("Nhap so tien can gui :");
                tienGui = sc.nextDouble();
                sc.nextLine();
                tk.GuiTien(tienGui);
                break;
            default  :
                System.out.println("Lua chon khong hop le!");
                break;
        }
    }
}
