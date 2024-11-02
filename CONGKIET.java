/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lthdt.congkiet;
import java.util.Scanner;
/**
 *
 * @author ThankPad
 */
public class CONGKIET {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ACTION ac = new ACTION();
        String option;
        TAIKHOAN tk1 = new TAIKHOANTIETKIEM
                                (20,"123123","Dang Cong Kiet",0,"abc123@");
        TAIKHOAN tk2 = new TAIKHOANTHANHTOAN
                                (1000000,"123123","Dang Cong Kiet",0,"abc123@");
        do {
            System.out.println("CHON TAI KHOAN:");
            System.out.println("1.TAI KHOAN TIET KIEM");
            System.out.println("2.TAI KHOAN THANH TOAN");
            System.out.println("Phim bat ky de thoat!");
            option = sc.nextLine();
            switch(option) {
                case "1" :
                    ac.DoSomeThing((TAIKHOANTIETKIEM) tk1);
                    break;
                case "2" :
                    ac.DoSomeThing((TAIKHOANTHANHTOAN) tk2);
                    break;
                default:
                    System.out.println("Thanh cong!");
                    break;
            }
        } while(option.equals("1") || option.equals("2"));
        sc.close();
    }   
}
