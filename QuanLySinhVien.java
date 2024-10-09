package TUAN6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {

    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    // Constructor không tham số
    public SinhVien() {
    }

    // Constructor có tham số
    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phương thức nhập thông tin sinh viên
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextDouble();
    }

    // Phương thức in thông tin sinh viên
    public void inThongTin() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Tên sinh viên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }

    // Getter cho thuộc tính điểm trung bình
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
}

public class QuanLySinhVien {

    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        // Nhập số lượng sinh viên
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = scanner.nextInt();

        // Nhập thông tin cho từng sinh viên
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSinhVien.add(sv);
        }

        // Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                // Sắp xếp theo điểm trung bình giảm dần
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
            }
        });

        // In danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
            System.out.println();  // In dòng trống giữa các sinh viên
        }
    }
}
