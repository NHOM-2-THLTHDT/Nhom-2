/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khanhly;

/**
 *
 * @author Windowns 10
 */
import java.util.Scanner;
public class Tuan3bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao phep toan(+,-,*,/): ");
        String ptoan = sc.nextLine();
        if(!ptoan.equals("+") && !ptoan.equals("-") && !ptoan.equals("*") && !ptoan.equals("/")) {
            System.out.print("Phep toan khong hop le");
        } else {
            System.out.print("Nhap vao 2 so: ");
            double s1 = sc.nextDouble();
            double s2 = sc.nextDouble();
            System.out.println("s1"+s1+"\ns2"+s2);
            double ketqua;
            if (ptoan.equals("+")) {
                ketqua = s1 + s2;
                System.out.print(s1 + " + " + s2 + " = " + ketqua);
            } else if (ptoan.equals("-")) {
                ketqua = s1 - s2;
                System.out.print(s1 + " - " + s2 + " = " + ketqua);
            } else if (ptoan.equals("/")) {
                if (s2 == 0) {
                    System.out.print("Khong the chia cho 0!");
                } else {
                    ketqua = s1 / s2;
                    System.out.print(s1 + " / " + s2 + " = " + ketqua);
                }
            } else {
                ketqua = s1 * s2;
                System.out.print(s1 + " * " + s2 + " = " + ketqua);
            }
        }
        sc.close();
    }
}
