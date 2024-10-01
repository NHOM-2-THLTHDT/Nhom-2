/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khanhly;

/**
 *
 * @author Windowns 10
 */

public class Tuan5Bai2 {
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int tg = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = tg;
        }
        System.out.print("Sau khi dao nguoc: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]=%d ",i,arr[i]);
        }
    }
}
