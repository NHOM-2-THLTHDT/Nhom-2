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

public class Tuan4Bai4 {
    
    public static boolean snt(int n) {
        int i;
        if (n == 1) 
            return false;
        else 
            for(i=2; i<n; i++) 
                if(n % i ==0)
                    return false;
        return true;
    }     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int n = sc.nextInt();
        if(snt(n))
            System.out.printf("%d la so nguyen to", n);
        else
            System.out.printf("%d khong phai so nguyen to",n);
        sc.close();
    }
}
