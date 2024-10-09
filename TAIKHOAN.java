/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan6;

/**
 *
 * @author Windowns 10
 */
public class TAIKHOAN {
    private String stk;
    private String chutk;
    private double sodu;
    public TAIKHOAN() {
        
    }
    public TAIKHOAN(String stk,String chutk,double sodu) {
        this.stk = stk;
        this.chutk = chutk;
        this.sodu = sodu;
    }
    public TAIKHOAN(TAIKHOAN tk) {
        this.stk = tk.stk;
        this.chutk = tk.chutk;
        this.sodu = tk.sodu;
    }
    public void guitien(double tiengui) {
        this.sodu += tiengui;
    }
    public void ruttien(double tienrut){
        this.sodu -=tienrut;
    } 
    public void kiemtrasodu() {
        System.out.println("So tai khoan      : "+this.stk);
        System.out.println("Ten chu tai khoan : "+this.chutk);
        System.out.println("So du hien tai    : "+this.sodu);
    }
    public static void main(String[] args) {
        TAIKHOAN tk = new TAIKHOAN("0905535825","Dang Cong Kiet",1000000000);
        tk.guitien(500000000);
        tk.kiemtrasodu();
        tk.ruttien(1000000000);
        tk.kiemtrasodu();
    }
}
