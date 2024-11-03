import java.util.*;

public class taiKhoanThanhToan extends TaiKhoan {
    private  String maPIN;
    static Scanner sc;
    public String getmaPIN(){
        return this.maPIN;
    }

    public taiKhoanThanhToan(){
        super();
    }

    public void NHAP(){
        super.NHAP();
        sc = new Scanner(System.in);
        System.out.printf("Moi ban nhap ma PIN:");
        this.maPIN= sc.nextLine();
        do {
            if (!kiemTraMaPIN(maPIN)) {
                System.out.printf("MA PIN nhap sai dinh dang,Ma PIN phai vao gom:");
                System.out.printf("\n 6 Chu so va bat dau la '1'");
                System.out.printf("\nMoi ban nhap mat khau       :");
                this.maPIN= sc.nextLine();
            }
        } while (!kiemTraMaPIN(maPIN));
    }
    public void XUAT(){
        super.XUAT();
        System.out.printf("Ma PIN tk la: %s", getmaPIN());
    }

    private boolean kiemTraMaPIN(String PIN) {
        // Kiểm tra mật khẩu chỉ bao gồm số và bắt đầu bằng 1
        return PIN.matches("1\\d{5}");
    }

    @Override
    public void rutTien(double B) {
        String AB;
        System.out.printf("Nhap vao so tien rut: ");
        B = sc.nextDouble();
        sc.nextLine(); 
        if (getsoDuTK() >= 0) {
            while (true) {
                if ((getsoDuTK() - B) < 0 && (getsoDuTK() - B) >= -2000000) {
                    System.out.printf("So du hien tai khong du. Ban co muon su dung muc khau chi khong (Y/N)?: ");
                    AB = sc.nextLine();
                    if (AB.equalsIgnoreCase("N")) {
                        System.out.printf("Nhap lai so tien muon rut:");
                        B = sc.nextDouble();
                        sc.nextLine(); 
                    } else if (AB.equalsIgnoreCase("Y")) {
                        System.out.println("Muc khau chi toi da: 2000000");
                        soDu = getsoDuTK() - B;
                        System.out.println("So du sau khi rut: " + soDu);
                        break;
                    }
                }
            }
        } else {
            while (true) {
                if ((getsoDuTK() - B) < -2000000) {
                    System.out.println("Muc khau chi khong du. Khong the rut them.");
                    System.out.printf("Moi nhap lai so tien muon rut:");
                    B = sc.nextDouble();
                    sc.nextLine();
                } else {
                    soDu = getsoDuTK() - B;
                    System.out.println("So du sau khi rut: " + soDu);
                    break;
                }   
            }
        }
    }
}

