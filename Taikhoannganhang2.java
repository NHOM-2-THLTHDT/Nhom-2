package nganhang;

import java.util.Scanner;

public class Taikhoannganhang2 {

    class TaiKhoan {
        private String soTaiKhoan;
        private String chuTaiKhoan;
        private double soDu;
        private String matKhau;

        // Constructor
        public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
            this.soTaiKhoan = soTaiKhoan;
            this.chuTaiKhoan = chuTaiKhoan;
            this.soDu = soDu;
            this.matKhau = matKhau;
        }

        // Phương thức gửi tiền
        public void guiTien(double soTien) {
            if (soTien > 0) {
                soDu += soTien;
                System.out.println("Gui tien thanh cong. So du hien tai: " + soDu);
            } else {
                System.out.println("So tien gui phai lon hon 0.");
            }
        }

        // Phương thức rút tiền
        public void rutTien(double soTien) {
            if (soTien > 0 && soTien <= soDu) {
                soDu -= soTien;
                System.out.println("Rut tien thanh cong. So du hien tai: " + soDu);
            } else {
                System.out.println("So tien rut khong hop le.");
            }
        }

        // Phương thức kiểm tra số dư
        public void kiemTraSoDu() {
            System.out.println("So du hien tai: " + soDu);
        }

        // Phương thức đổi mật khẩu
        public void doiMatKhau(String matKhauCu, String matKhauMoi) {
            if (matKhauCu.equals(this.matKhau)) {
                this.matKhau = matKhauMoi;
                System.out.println("Doi mat khau thanh cong.");
            } else {
                System.out.println("Mat khau cu khong chinh xac.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng của lớp ngoài
        Taikhoannganhang2 taikhoannganhang2 = new Taikhoannganhang2();

        // Yêu cầu người dùng nhập thông tin tài khoản
        System.out.print("Nhap so tai khoan: ");
        String soTaiKhoan = scanner.nextLine();

        System.out.print("Nhap ten chu tai khoan: ");
        String chuTaiKhoan = scanner.nextLine();

        System.out.print("Nhap so du ban dau: ");
        double soDu = scanner.nextDouble();

        System.out.print("Nhap mat khau: ");
        scanner.nextLine(); 
        String matKhau = scanner.nextLine();

        // Tạo đối tượng của lớp TaiKhoan
        Taikhoannganhang2.TaiKhoan tk = taikhoannganhang2.new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu, matKhau);

        // Kiểm tra số dư ban đầu
        System.out.println("Kiem tra so du ban dau:");
        tk.kiemTraSoDu();

        // Gửi tiền
        System.out.println("\nGui tien:");
        System.out.print("Nhap so tien gui: ");
        double soTienGui = scanner.nextDouble();
        tk.guiTien(soTienGui);

        // Rút tiền
        System.out.println("\nRut tien:");
        System.out.print("Nhap so tien rut: ");
        double soTienRut = scanner.nextDouble();
        tk.rutTien(soTienRut);

        // Kiểm tra số dư sau khi giao dịch
        System.out.println("\nKiem tra so du:");
        tk.kiemTraSoDu();

        // Đổi mật khẩu
        System.out.println("\nDoi mat khau:");
        System.out.print("Nhap mat khau cu: ");
        scanner.nextLine(); 
        String matKhauCu = scanner.nextLine();

        System.out.print("Nhap mat khau moi: ");
        String matKhauMoi = scanner.nextLine();
        tk.doiMatKhau(matKhauCu, matKhauMoi);
    }
}