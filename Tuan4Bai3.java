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
public class Tuan4Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,gt = 1;
        System.out.print("Nhap vao so nguyen duong: ");
        N = sc.nextInt();
        for(int i=1; i<=N ; i++) {
            gt *= i;
        }
        System.out.printf("%d! = %d",N,gt);
    }
}
