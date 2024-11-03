import java.util.*;
public class lopchinh {
    static double soTienGui;
    static double soTienRut;
    static int luaChon;
    static Scanner sc;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
        TaiKhoan TKTT = new taiKhoanThanhToan();
        TaiKhoan TKTK = new taiKhoanTietKiem();
        /////////////
        int tk1;
        do {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("1. Tai khoan thanh toan  ");
            System.out.println("2. Tai khoan tiet kiem   ");
            System.out.println("0. Thoat                 ");
            System.out.println("-------------------------");
            System.out.printf("\nNhap vao loai tai khoan muon tao:");
            tk1= sc.nextInt();
            switch (tk1) {
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                case 1: //Tài khoản thanh toán
                    int tk2;
                    TKTT.NHAP();
                    System.out.println("Tao tai khoan thanh cong.");
                    TKTT.XUAT();
                    do {
                        System.out.println();
                        System.out.println("-------------------------");
                        System.out.println("1. Gui tien vao tai khoan");
                        System.out.println("2. Rut tien mat          ");
                        System.out.println("3. Doi mat khau          ");
                        System.out.println("0. Dang xuat tai khoan   ");
                        System.out.println("-------------------------");
                        System.out.printf("\nNhap vao tuy chon:");
                        tk2= sc.nextInt();
                        switch (tk2) {
                            case 0:
                                System.out.println("Dang xuat tai khoan thanh cong.");
                                break;
                            case 1:
                                System.out.printf("\nNhap vao so tien muon gui:");
                                soTienGui = sc.nextDouble();
                                TKTT.GuiTien(soTienGui);
                                TKTT.XUAT();
                                break;
                            case 2:
                                if (TKTT.getsoDuTK() > -2000000) {
                                    TKTT.rutTien(soTienRut);
                                    TKTT.XUAT();
                                } 
                                else{
                                    System.out.println("Muc khau chi da dat gioi han. Khong the rut duoc nua!");
                                }
                                break;
                            case 3:
                                String matKhauTT;
                                String matKhauNewTT;
                                System.out.printf("\nNhap vao mat khau hien tai:");
                                matKhauTT = sc.nextLine();
                                sc.nextLine();
                                TKTT.MatKhauCu(matKhauTT);
                                System.out.printf("\nNhap mat khau moi: ");
                                matKhauNewTT = sc.nextLine();
                                TKTT.MatKhauMoi(matKhauNewTT);
                                TKTT.doiMatKhau(matKhauNewTT);
                                TKTT.XUAT();
                                break;
                            default:
                                System.out.println("Tuy chon khong ton tai.");
                                break;
                        }
                    } while (tk2 !=0);
                    break;
                case 2: //Tài khoản tiết kiệm
                    int tk3;
                    TKTK.NHAP();
                    TKTK.XUAT();
                    do {
                        System.out.println();
                        System.out.println("-------------------------");
                        System.out.println("1. Gui tien tiet kiem    ");
                        System.out.println("2. Rut tien mat          ");
                        System.out.println("3. Doi mat khau          ");
                        System.out.println("0. Thoat chuong trinh    ");
                        System.out.println("-------------------------");
                        System.out.printf("\nNhap vao tuy chon:");
                        tk3= sc.nextInt();
                        switch (tk3) {
                            case 0:
                                System.out.println("Thoat chuong trinh.");
                                break;
                            case 1:
                                System.out.printf("\nNhap vao so tien muon gui:");
                                soTienGui = sc.nextDouble();
                                do {
                                    if (soTienGui < 0) {
                                        System.out.printf("So tien gui phai lon hon 0");
                                        System.out.printf("\nNhap vao so tien muon gui:");
                                        soTienGui = sc.nextDouble();
                                    }
                                } while (soTienGui <0);
                                System.out.println("-------------------------");
                                System.out.println("1. Chu ky 3 thang : 3.45 percent/nam");
                                System.out.println("2. Chu ky 6 thang : 4.55 percent/nam");
                                System.out.println("3. Chu ky 9 thang : 4.55 percent/nam");
                                System.out.println("4. Chu ky tren 12 thang: 4.95 percent/nam");
                                System.out.println("5. Lai khong ky han: 0.5 percent/nam");
                                System.out.println("-------------------------");
                                System.out.printf("Nhap vao lua chon ky han gui:");
                                luaChon = sc.nextInt();
                                if (luaChon==1) {
                                    double LaiSuat1 = 3.45/100;
                                    System.out.printf("Lai sau chu ky cua ban la: %.3f", (TKTK.getsoDuTK()*(LaiSuat1/12)*3));
                                }
                                if (luaChon==2) {
                                    double LaiSuat2 = 4.55/100;
                                    System.out.printf("Lai sau chu ky cua ban la: %.3f", (TKTK.getsoDuTK()*(LaiSuat2/12)*6));
                                }
                                if (luaChon==3) {
                                    double LaiSuat3 = 4.55/100;
                                    System.out.printf("Lai sau chu ky cua ban la: %.3f", (TKTK.getsoDuTK()*(LaiSuat3/12)*9));
                                }
                                if (luaChon==4) {
                                    double LaiSuat4 = 4.95/100;
                                    System.out.printf("Lai sau chu ky cua ban la: %.3f", (TKTK.getsoDuTK()*(LaiSuat4/12)*12));
                                }
                                if (luaChon==5) {
                                    double LaiSuat5 = 0.5/100;
                                    System.out.printf("Lai sau moi thang cua ban la: %.3f", (TKTK.getsoDuTK()*(LaiSuat5/12)));
                                }
                                TKTK.GuiTien(soTienGui);
                                TKTK.XUAT();
                                break;
                            case 2: 
                                if (TKTK.getsoDuTK() > 0) {
                                    TKTK.rutTien(soTienRut);
                                    TKTK.XUAT();
                                }
                                else{
                                    System.out.println("So du hien tai bang 0. Khong the rut duoc!");
                                }
                                break;
                            case 3:
                                String matKhauTK;
                                String matKhauNewTK;
                                System.out.printf("\nNhap vao mat khau hien tai:");
                                matKhauTK = sc.nextLine();
                                sc.nextLine();
                                TKTK.MatKhauCu(matKhauTK);
                                System.out.printf("\nNhap mat khau moi: ");
                                matKhauNewTK = sc.nextLine();
                                TKTK.MatKhauMoi(matKhauNewTK);
                                TKTK.doiMatKhau(matKhauNewTK);
                                TKTK.XUAT();
                                break;
                            default:
                                System.out.println("Tuy chon khong ton tai.");
                                break;
                        }
                    } while (tk3 != 0);
                    break;
                default:
                    System.out.println("Tuy chon khong ton tai.");
                    break;
            }
        } while (tk1 !=0);
    }
}