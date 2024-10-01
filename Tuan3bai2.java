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
public class Tuan3bai2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao diem trung binh: ");
        float dtb = sc.nextFloat();
        if(dtb >= 8.0) {
            System.out.print("la hoc sinh gioi");
        } else if(dtb >= 6.5){
            System.out.print("la hoc sinh kha");
        } else if(dtb >= 5) {
            System.out.print("la hoc sinh trung binh");
        } else {
            System.out.print("la hoc sinh yeu");
        }
        sc.close();
    }
}
