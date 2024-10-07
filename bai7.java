/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan5;

/**
 *
 * @author ThankPad
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String masinhvien;
    private String tensinhvien;
    private double dtb;

    public String getmasinhvien() {
        return this.masinhvien;
    }

    public String gettensinhvien() {
        return this.tensinhvien;
    }

    public double getdtb() {
        return this.dtb;
    }

    public Student() {
    }

    public Student(String masinhvien, String tensinhvien, double dtb) {
        this.masinhvien = masinhvien;
        this.tensinhvien = tensinhvien;
        this.dtb = dtb;
    }

    public Student(Student s) {
        this.masinhvien = s.masinhvien;
        this.tensinhvien = s.tensinhvien;
        this.dtb = s.dtb;
    }
}

class DanhSach {
    private List<Student> list = new ArrayList<>();

    public void themsinhvien(String msv, String tensv, double dtb) {
        Student st = new Student(msv, tensv, dtb);
        list.add(st);
    }

    public void xoasinhvien(String msv) {
        list.removeIf(h -> h.getmasinhvien().equals(msv));
    }

    public void timkiem(String msv) {
        boolean found = false;
        for (Student h : list) {
            if (h.getmasinhvien().equals(msv)) {
                System.out.println("Tim thay " + msv);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay " + msv);
        }
    }

    public void sapxep() {
        Collections.sort(list, Comparator.comparingDouble(Student::getdtb));
    }

    public void xuat() {
        for (Student h : list) {
            System.out.printf("Ma sinh vien: %-20s Ten: %-30s Diem trung binh: %.2f\n",
                    h.getmasinhvien(), h.gettensinhvien(), h.getdtb());
        }
    }
}

public class bai7 {
    public static void main(String[] args) {
        DanhSach ds = new DanhSach();
        ds.themsinhvien("23115053122115", "Dang Cong Kiet", 10);
        ds.themsinhvien("23115053122118", "Nguyen Thi Khanh Ly", 100);
        ds.themsinhvien("23115053122119", "Nguyen Van A", 9);
        ds.themsinhvien("23115053122110", "Nguyen Thi B", 10);
        
        // Xóa sinh viên
        ds.xoasinhvien("23115053122110");
        
        // Sắp xếp danh sách theo điểm trung bình
        ds.sapxep();
        
        // Xuất danh sách
        ds.xuat();
        
        // Tìm kiếm sinh viên
        ds.timkiem("23115053122118");
    }
}