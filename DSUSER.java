/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHAHANG;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author ThankPad
 */
public class DSUSER {
    HashMap<String,KHACHHANG> dskhachhang = new HashMap<String,KHACHHANG>() ;
    HashMap<String,NHANVIEN> dsnhanvien = new HashMap<String,NHANVIEN>() ;
    Scanner sc = new Scanner(System.in);

    public DSUSER() {
    }
    
    public void ThemNhanVien(NHANVIEN nv) {
        dsnhanvien.put(nv.getTenDN(), nv);
    }
    public void XoaNhanVien(NHANVIEN nv) {
        dsnhanvien.remove(nv.getTenDN());
    }
    public void ThemKhachHang(KHACHHANG kh) {
        dskhachhang.put(kh.getTenDN(), kh);
    }
    public void XoaKhachHang(KHACHHANG kh) {
        dskhachhang.remove(kh.getTenDN());
    }
    public static boolean kiemTraMatKhau(String password) {
        // Kiểm tra độ dài ít nhất 6 ký tự
        if (password.length() < 6) {
            return false;
        }
        
        // Kiểm tra ký tự đầu tiên là chữ cái
        if (!Character.isLetter(password.charAt(0))) {
            return false;
        }
        
        // Kiểm tra có ít nhất 1 ký tự đặc biệt
        String specialChars = "[!@#$%^&*(),.?\":{}|<>]";
        Pattern pattern = Pattern.compile(specialChars);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()) {
            return false;
        }
        
        return true;
    }
    public void NhanVienDangNhap(DSBAN dsban,MENU menu,DSDON dsdon,int[] soHD) {
        String id;
        String pass;
        System.out.print("Ten dang nhap: ");
        id = sc.nextLine();
        System.out.print("Mat khau: ");
        pass = sc.nextLine();
        if(checkNhanVien(id) && pass.equals(this.dsnhanvien.get(id).getPass())) {
            int option;
            String sohd;
            do {
                System.out.println("1.Order");
                System.out.println("2.Them mon");
                System.out.println("3.Xoa mon");
                System.out.println("4.Tinh tien");
                System.out.println("5.Lich su don hang");
                System.out.println("6.Xem danh gia");
                System.out.println("0.Dang xuat");
                option = sc.nextInt();
                sc.nextLine();
                switch(option) {
                    case 1 :
                        int ban;
                        String mon;
                        DON don = new DON();
                        dsban.INBAN();
                        do {
                            ban = sc.nextInt();
                            sc.nextLine();
                            if(dsban.dsban.get(ban).getTrangThai().equals("Da Dat"))
                                System.out.println("Ban nay da duoc dat, chon lai: ");
                        } while(dsban.dsban.get(ban).getTrangThai().equals("Da Dat"));                   
                        dsban.CapNhatTrangThai(dsban.dsban.get(ban), "Da Dat");
                        menu.InMenu();
                        System.out.println("nhap d de hoan tat.");
                        do {
                            mon = sc.nextLine();
                            if(!mon.equals("d"))
                                don.goiMon(menu.menu.get(mon));
                        } while(!mon.equals("d"));
                        don.INHD();
                        don.setMaKH("Nhan vien order");
                        don.setMaHD("HD"+soHD[0]);
                        don.setSoBan(ban);
                        dsdon.ThemDon(don);
                        System.out.println("Order thanh cong " + "ma hoa don: " + "HD"+soHD[0]);
                        soHD[0] ++;
                        break;
                    case 2 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));                        
                        menu.InMenu();
                        String monThem;
                        System.out.println("Nhap vao ten mon muon them: ");
                        monThem = sc.nextLine();
                        dsdon.dsdon.get(sohd).goiMon(menu.menu.get(monThem));
                        System.out.println("Da them mon.");
                        break;
                    case 3 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));  
                        dsdon.dsdon.get(sohd).INHD();
                        String monXoa;
                        System.out.println("Nhap vao ten mon muon xoa: ");
                        monXoa = sc.nextLine();
                        dsdon.dsdon.get(sohd).huyMon(monXoa);
                        System.out.println("Xoa mon thanh cong.");
                        break;
                    case 4 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));  
                        dsban.dsban.get(dsdon.dsdon.get(sohd).getSoBan()).setTrangThai("ranh");
                        dsdon.dsdon.get(sohd).INHD();
                        System.out.println("Tong tien: "+dsdon.dsdon.get(sohd).TongTien()+"VND");
                        
                        break;
                    case 5 :
                        dsdon.inDonALL();
                        break;
                    case 6 :
                        dsnhanvien.get(id).XemDanhGia();
                        break;
                    case 0 :
                        System.out.println("da dang xuat!");
                        break;
                }
            } while(option == 1 || option ==2 || option == 3 || option == 4 || option == 5 || option == 6);
        } else
            System.out.println("Dang nhap that bai!");
    }
    public void KhachHangDangNhap(DSBAN dsban,MENU menu,DSDON dsdon,int[] soHD) {
        String id;
        String pass;
        System.out.print("Ten dang nhap: ");
        id = sc.nextLine();
        System.out.print("Mat khau: ");
        pass = sc.nextLine();
        if(checkKhachHang(id) && pass.equals(this.dskhachhang.get(id).getPass())){
            int option;
            String sohd;
            do {
                System.out.println("1.Dat ban");
                System.out.println("2.Huy ban");
                System.out.println("3.Them mon");
                System.out.println("4.Xoa mon");
                System.out.println("5.Thanh toan");
                System.out.println("6.Lich su don hang");
                System.out.println("7.Danh gia phuc vu");
                System.out.println("0.dang xuat");
                option = sc.nextInt();
                sc.nextLine();
                switch(option) {
                    case 1 :
                        int ban;
                        String mon;
                        DON don = new DON();
                        dsban.INBAN();
                        do {
                            ban = sc.nextInt();
                            sc.nextLine();
                            if(dsban.dsban.get(ban).getTrangThai().equals("Da Dat"))
                                System.out.println("Ban nay da duoc dat, chon lai: ");
                        } while(dsban.dsban.get(ban).getTrangThai().equals("Da Dat"));
                        dsban.CapNhatTrangThai(dsban.dsban.get(ban), "Da Dat");
                        menu.InMenu();
                        System.out.println("nhap d de hoan tat.");
                        do {
                            mon = sc.nextLine();
                            if(!mon.equals("d"))
                                don.goiMon(menu.menu.get(mon));
                        } while(!mon.equals("d"));
                        don.INHD();
                        don.setMaKH(id);
                        don.setMaHD("HD"+soHD[0]);
                        don.setSoBan(ban);
                        dsdon.ThemDon(don);
                        System.out.println("Dat ban thanh cong " + "ma hoa don: " + "HD"+soHD[0]);
                        soHD[0] ++;
                        break;
                    case 2 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));  
                        dsban.dsban.get(dsdon.dsdon.get(sohd).getSoBan()).setTrangThai("ranh");
                        dsdon.XoaDon(sohd);
                        System.out.println("Da xoa don dat.");
                        break;
                    case 3 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));  
                        menu.InMenu();
                        String monThem;
                        System.out.println("Nhap vao ten mon muon them: ");
                        monThem = sc.nextLine();
                        dsdon.dsdon.get(sohd).goiMon(menu.menu.get(monThem));
                        System.out.println("Da goi them mon.");
                        break;
                    case 4 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));  
                        dsdon.dsdon.get(sohd).INHD();
                        String monXoa;
                        System.out.println("Nhap vao ten mon muon xoa: ");
                        monXoa = sc.nextLine();
                        dsdon.dsdon.get(sohd).huyMon(monXoa);
                        System.out.println("da xoa mon.");
                        break;
                    case 5 :
                        do {
                            System.out.println("Nhap vao so hoa don: ");
                            sohd = sc.nextLine();
                            if(!dsdon.TonTai(sohd))
                                System.out.println("Hoa don khong ton tai.");
                        } while(!dsdon.TonTai(sohd));  
                        dsban.dsban.get(dsdon.dsdon.get(sohd).getSoBan()).setTrangThai("ranh");
                        dsdon.dsdon.get(sohd).setTrangThai("Da thanh toan.");
                        dsdon.dsdon.get(sohd).ThanhToan(dskhachhang.get(id));
                        break;
                    case 6 :
                        dsdon.inDonKH(id);
                        break;
                    case 7 :
                        String mnv;
                        System.out.println("Nhap ma nhan vien ban muon danh gia: ");
                            for(NHANVIEN value : dsnhanvien.values()) {
                                System.out.println("id: "+value.tenDN+", "+value.ten);
                            }
                            mnv = sc.nextLine();
                            dskhachhang.get(id).vietDanhGia(dsnhanvien.get(mnv));
                        break;
                    case 0 :
                        System.out.println("Da dang xuat!");
                        break;
                }
            } while(option == 1 || option ==2 || option == 3 || option == 4 || option == 5 || option == 6 || option == 7);
        } else
            System.out.println("Dang nhap that bai!");
    }
    public boolean checkKhachHang(String tenDN) {
        for (String key : dskhachhang.keySet()) {
            if(key.equals(tenDN))
                return true;
        }
        return false;
    }
    public boolean checkNhanVien(String tenDN) {
        for (String key : dsnhanvien.keySet()) {
            if(key.equals(tenDN))
                return true;
        }
        return false;
    }
    public void DangKyKhachHang() {
        String ten;
        int tuoi;
        int gioitinh;
        String sdt;
        String tenDN;
        String pass;
        String passConfirm;
        System.out.println("Xin moi nhap ten cua ban: ");
        ten = sc.nextLine();
        System.out.println("Xin moi nhap tuoi cua ban: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Xin moi nhap vao gioi tinh cua ban(1.Nam 0.Nu): ");
        gioitinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Xin moi nhap vao so dien thoai cua ban: ");
        sdt = sc.nextLine();
        do {
            System.out.println("Xin moi tao mot ten dang nhap moi: ");
            tenDN = sc.nextLine();
            if(checkKhachHang(tenDN))
                System.out.println("Ten dang nhap nay da ton tai!");
        }while(checkKhachHang(tenDN));
        do{
            System.out.println("Xin moi tao mat khau: ");
            pass = sc.nextLine();
            if(!kiemTraMatKhau(pass))
                System.out.print("Mat khau phai dai toi thieu 6, bat dau bang chu cai va co chua ki tu dac biet.");
        } while(!kiemTraMatKhau(pass));
        do {
            System.out.println("Xac nhan lai mat khau: ");
            passConfirm = sc.nextLine();
            if(!passConfirm.equals(pass))
                System.out.println("Khong trung voi mat khau da nhap!");
        } while(!passConfirm.equals(pass));
        System.out.println("Dang ki tai khoan thanh cong!");
        KHACHHANG kh = new KHACHHANG(0,0,tenDN,pass,ten,tuoi,gioitinh,sdt);
        this.ThemKhachHang(kh);
    }
}
