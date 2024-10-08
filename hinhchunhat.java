import java.util.Scanner;
public class hinhchunhat {
    private double chieuDai;
    private double chieuRong;

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double dienTich(){
        return this.chieuDai*this.chieuRong ;
    }
    public double chuVi(){
        return (this.chieuDai+this.chieuRong)*2;
    }
    public void in(){
        System.out.printf("Dien tich hinh chu nhat la:%.2f",dienTich());
        System.out.println("");
        System.out.printf("Chu vi hinh chu nhat la:%.2f",chuVi());
    }
}
