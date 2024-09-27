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

public class Tuan3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so can kiem tra: ");
        int x = scanner.nextInt();
        if(x == 0) {
            System.out.print("Bang 0");
        } else if(x > 0) {
            System.out.print(x + " la so duong");
        } else {
            System.out.print(x + " la so am");
        }
        scanner.close();
    }    
}
