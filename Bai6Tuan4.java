import java.util.Scanner;
public class Bai6Tuan4 {
    public static void main(String[] args) {
        System.out.print("Nhap vao mot so nguyen:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int num=0;
        while(a!=0){
            int du=a%10; //lay chu so cuoi cua a
            num=num*10+du;//them chu so cuoi do vao bien num
            a=a/10;// loai bo chu so cuoi cung cua a
        }
        if(num==n)
            System.out.println(n+" la so doi xung");
        else
            System.out.println(n+" khong phai la so doi xung");
    }
}
