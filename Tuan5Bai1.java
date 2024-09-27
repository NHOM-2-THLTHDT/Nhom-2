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
public class Tuan5Bai1 {
    static Scanner sc;
    static int N;
    static int[] M;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        N = sc.nextInt();
        M = new int[N];
        for(int i=0; i< N; i++) {
            System.out.printf("M[%d]=",i);
            M[i] = sc.nextInt();
        }
        System.out.printf("Tong cac phan tu cua M la %d",Tong());
    }
    static int Tong() {
        int s = 0;
        for(int i:M) {
            s += i;
        }
        return s;
    }
}
