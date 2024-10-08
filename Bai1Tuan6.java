import java.util.Scanner;
public class Bai1Tuan6 {
    public static void main(String[] args) {
        hinhchunhat hcn = new hinhchunhat();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai va chieu rong:");
        double chieuDai = sc.nextInt();
        double chieuRong =sc.nextInt();
        hcn.setChieuDai(chieuDai);
        hcn.setChieuRong(chieuRong);
        hcn.in();
        
    }
}
