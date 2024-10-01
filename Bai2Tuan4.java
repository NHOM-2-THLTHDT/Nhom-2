import java.util.Scanner;
public class Bai2Tuan4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Bang cuu chuong"+i);
            for(int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
            System.out.println("");
        }
            
               
    }
}
