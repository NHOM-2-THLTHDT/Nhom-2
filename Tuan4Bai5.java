package TUAN4;

import java.util.Scanner;

public class Bai5 {

    public static int timUCLN(int a, int b) {

        if (a % b == 0) { 
            return b;
        }
         else {
            return timUCLN(b, a%b);
        }
    }

    public static int timBCNN(int a, int b) {
        return (a * b) / timUCLN(a, b);  
    }

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();

        int ucln = timUCLN(a, b);
     
        int bcnn = timBCNN(a, b);

        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + ucln);
        System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + bcnn);
    }
}
