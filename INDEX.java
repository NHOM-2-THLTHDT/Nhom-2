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
public class INDEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {0};
        MENU menu = new MENU();
        DSBAN dsban = new DSBAN();
        DSUSER dsuser = new DSUSER();
        DSDON dsdon = new DSDON();
        MON mon1 = new MON("banh mi",15000);
        MON mon2 = new MON("bun bo hue",30000);
        MON mon3 = new MON("pho",35000);
        MON mon4 = new MON("trung op la",15000);
        MON mon5 = new MON("com tam",25000);
        MON mon6 = new MON("my phu chiem",25000);
        MON mon7 = new MON("trung cut lon xao me",25000);
        MON mon8 = new MON("hu tieu",25000);
        menu.ThemMon(mon1);
        menu.ThemMon(mon2);
        menu.ThemMon(mon3);
        menu.ThemMon(mon4);
        menu.ThemMon(mon5);
        menu.ThemMon(mon6);
        menu.ThemMon(mon7);
        menu.ThemMon(mon8);
        NHANVIEN nv1 = new NHANVIEN("nv1@@@","abc123","Dang Cong Kiet",21,1,"0896998961");
        NHANVIEN nv2 = new NHANVIEN("nv2@@@","abc123","Nguyen Thi Khanh Ly",21,0,"0905535825");
        NHANVIEN nv3 = new NHANVIEN("nv3@@@","abc123","Nguyen Nu Khanh Ngoc",21,0,"0766611005");
        NHANVIEN nv4 = new NHANVIEN("nv4@@@","abc123","Truong Thi Kieu Nhi",21,0,"0345582746");
        dsuser.ThemNhanVien(nv1);
        dsuser.ThemNhanVien(nv2);
        dsuser.ThemNhanVien(nv3);
        dsuser.ThemNhanVien(nv4);
        BAN b1 = new BAN(1,10,"ranh");
        BAN b2 = new BAN(2,20,"ranh");
        BAN b3 = new BAN(3,10,"ranh");
        BAN b4 = new BAN(4,20,"ranh");
        BAN b5 = new BAN(5,10,"ranh");
        BAN b6 = new BAN(6,20,"ranh");
        BAN b7 = new BAN(7,10,"ranh");
        BAN b8 = new BAN(8,20,"ranh");
        BAN b9 = new BAN(9,10,"ranh");
        BAN b10 = new BAN(10,20,"ranh");
        dsban.ThemBan(b10);
        dsban.ThemBan(b9);
        dsban.ThemBan(b8);
        dsban.ThemBan(b7);
        dsban.ThemBan(b6);
        dsban.ThemBan(b5);
        dsban.ThemBan(b4);
        dsban.ThemBan(b3);
        dsban.ThemBan(b2);
        dsban.ThemBan(b1);
        int option;
        do {
            System.out.println("Ban la: ");
            System.out.println("1. Nhan vien");
            System.out.println("2. Khach hang");
            System.out.println("0. Thoat");
            option = sc.nextInt();
            sc.nextLine();
            switch(option) {
                case 1 :
                    dsuser.NhanVienDangNhap(dsban,menu,dsdon,x);
                    break;
                case 2 :
                    int optionkh;
                    do {
                        System.out.println("1.Dang nhap");
                        System.out.println("2.Dang ky");
                        System.out.println("0.Thoat");
                        optionkh = sc.nextInt();
                        sc.nextLine();
                        switch(optionkh) {
                            case 1:
                                dsuser.KhachHangDangNhap(dsban,menu,dsdon,x);
                                break;
                            case 2:
                                dsuser.DangKyKhachHang();
                                break;
                            case 0:
                                System.out.println("Da thoat!");
                        }
                    } while(optionkh == 1 || optionkh == 2);                    
                    break;
                case 0 :
                    System.out.println("Hoan tat!");
                    break;
            }
        } while(option == 1 || option == 2);
    }
}
