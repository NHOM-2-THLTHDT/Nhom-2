/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congkiet;

/**
 *
 * @author ThankPad
 */
import java.util.Scanner;

public class Tuan3Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ba canh a, b, c cua tam giac: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();  
        if(a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giac la tam giac deu");
            }
            else {
                double max = Math.max(a, Math.max(b, c));
                double sumOfSquares = (a * a) + (b * b) + (c * c) - (max * max);
                if (max * max - sumOfSquares == 0) {
                    System.out.println("Tam giac la tam giac vuong");
                }
                else if (a == b || b == c || a == c) {
                    System.out.println("Tam giac la tam giac can");
                }
                else {
                    System.out.println("Tam giac la tam giac thuong");
                }
            }
        } else {
            System.out.println("Ba canh nhap vao k the tao thanh tam giac");
        }
        scanner.close();
    }
}
