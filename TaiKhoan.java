import java.util.*;
public abstract class TaiKhoan{
    protected String soTaiKhoan;
    protected String chuTaiKhoan;
    protected double soDu;
    protected String matKhau;
    private  Scanner sc;

    public String getSOTK(){
        return this.soTaiKhoan;
    }

    public String getCHUTK(){
        return this.chuTaiKhoan;
    }

    public double getsoDuTK(){
        return this.soDu;
    }

    public String getmatKhauTK(){
            return this.matKhau;
    }

    public TaiKhoan(){
        sc = new Scanner(System.in);
    }

    public void NHAP(){
        sc = new Scanner(System.in);//sc la kieu nhap voi cach thuc nhap vao la : system.in - nhap vao tu ban phim)
        System.out.printf("Moi ban nhap thong tin STK  :");
        this.soTaiKhoan=sc.nextLine();
        System.out.printf("Moi ban nhap thong tin CHUTK:");
        this.chuTaiKhoan=sc.nextLine();
        System.out.printf("Moi ban nhap So DU TK       :");
        this.soDu= sc.nextDouble();
        do {
            if (kiemtraSoDuAm(this.soDu)) {
                System.out.printf("So du phai lon hon 0.");
                System.out.printf("\nMoi ban nhap So DU TK:");
                this.soDu= sc.nextDouble();
            }
        } while (kiemtraSoDuAm(this.soDu));
        sc.nextLine();
        System.out.printf("Moi ban nhap mat khau       :");
        this.matKhau= sc.nextLine();
        do {
            if (!kiemTraDoManhMatKhau(matKhau)) {
                System.out.printf("Mat khau nhap sai dinh dang,Mat khau phai vao gom:");
                System.out.printf("\n+Chu. cai thuong\n+Chu so.\n+Ki tu dac biet.\n");
                System.out.printf("Moi ban nhap mat khau       :");
                this.matKhau= sc.nextLine();
            }
        } while (!kiemTraDoManhMatKhau(matKhau));
    }

    public void XUAT(){
        System.out.printf("\nSTK              : %s  ", getSOTK());
        System.out.printf("\nChu TK           : %s  ", getCHUTK());
        System.out.printf("\nSo Du TK         : %.3f", getsoDuTK());
        System.out.printf("\nMat Khau hien tai: %s \n ", getmatKhauTK());
    }

    public void GuiTien(double A){
      this.soDu = this.soDu +A;  
    };//Phuong thuc nay se cap nhat so du = so du + sotien nhap vao

    public abstract void rutTien(double B);

    //Đổi mật khẩu mới
    public void doiMatKhau(String input){
        this.matKhau = input;
    }

    //Kiểm tra nhập lại mật khẩu hiện tại
    public void MatKhauCu(String matkhauu){
        int solanSAI = 0;
        do
        {
            while ((!(matkhauu.equals(this.matKhau))) && solanSAI <= 3) {
                System.out.printf("Mat khau cu nhap sai, moi nhap lai! ");
                System.out.printf("\nNhap mat khau hien tai: ");
                matkhauu = sc.nextLine();
            }
            if((!(matkhauu.equals(this.matKhau))) && solanSAI > 3){
                System.out.println("Ban da nhap sai qua 3 lan. Tai khoan bi tam khoa");
                return;
            }
        }while((!(matkhauu.equals(this.matKhau))) && solanSAI <= 3);
    }
    
    //Kiểm tra mật khẩu mới có trùng với mật khẩucũ không
    public void MatKhauMoi(String MKnew){
        do
        {
            if (MKnew.equals(this.matKhau)) {
                System.out.printf("\nMat khau moi khong the trung voi mk cu.\n");
                System.out.printf("\nNhap mat khau moi: ");
                MKnew = sc.nextLine();
            }
        }while (MKnew.equals(this.matKhau));
    }
    //Kiểm tra độ mạnh yếu của mật khẩu
    public boolean kiemTraDoManhMatKhau(String matKhau)
    {
        return matKhau.length() >= 6 &&
                matKhau.matches(".*[a-zA-Z]+.*") &&
                matKhau.matches(".*[0-9]+.*") &&
                matKhau.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
    }

    //Kiểm tra số dư âm hay dương
    public boolean kiemtraSoDuAm(double DoiTuong){
        return (DoiTuong < 0);
    }

    //Kiểm tra tiền rút khỏi tài khoản
    public boolean kiemtraSoDuChuyen(double  Money){
        return this.soDu < Money;
    }

    // kiểm tra số dư nhập vào có đủ điều kiện không
    public  boolean kiemtraSoDu(double DoiTuong){
        return (DoiTuong > 20000000) && (DoiTuong < 1000000000);
    }
}

