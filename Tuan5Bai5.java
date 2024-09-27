/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congkiet;

/**
 *
 * @author ThankPad
 */
import java.util.*;

public class Tuan5Bai5 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static List<Integer> integerList;
    public static void main(String[] args) {
        integerList = new ArrayList<>();
        System.out.print("Nhap vao so luong so nguyen: ");
        N = sc.nextInt();
        for(int i=0; i<N; i++) {
            System.out.printf("Nhap phan tu thu %d ",i+1);
            int num = sc.nextInt();
            integerList.add(num);
        }
        for(int i:integerList) {
            System.out.printf("%d   ",i);
        }
    }
}
