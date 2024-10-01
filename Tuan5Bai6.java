/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khanhly;

/**
 *
 * @author Windowns 10
 */
import java.util.ArrayList;
import java.util.List;

public class Tuan5Bai6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        numbers.add(1, 1);
        System.out.println("Sau khi thêm: " + numbers);
        numbers.remove(2);
        System.out.println("Sau khi xóa: " + numbers);
    }
}