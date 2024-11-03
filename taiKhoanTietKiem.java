import java.util.*;

public class taiKhoanTietKiem extends TaiKhoan {
    static  Scanner sc;

    public taiKhoanTietKiem(){
        super();
    }

    public void NHAP(){
        super.NHAP();
       
    }

    public void XUAT(){
        super.XUAT();
    }

    @Override
    public void rutTien(double B){
        sc = new Scanner(System.in);
        System.out.printf("Nhap vao so tien rut: ");
        B=sc.nextDouble();
        do {
            if(B > getsoDuTK()){
                System.out.printf("\nSo du khong du. Moi ban nhap lai so tien rut: ");
                B=sc.nextDouble();
            }else {
                soDu = getsoDuTK() - B;
                System.out.println("So du sau khi rut: " + soDu);
                break;
            }
        } while (B > getsoDuTK());
        soDu = getsoDuTK() - B;
        System.out.println("So du sau khi rut: " + soDu);
    }


}
