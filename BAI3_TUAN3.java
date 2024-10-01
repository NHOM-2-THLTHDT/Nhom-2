import java.util.Scanner;
public class BAI3_TUAN3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap 3 so a,b,c lan luot la:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        
        if(a==0)
            if(b==0)
                if(c==0)
                    System.out.print("Phuong trinh vo so nghiem");
                else
                    System.out.print("Phuong trinh vo nghiem");
            else
            {
                double x=-c/b;
                System.out.printf("Nghiem cua phuong trinh:x=%.2f",x);
            }  
        else
        {
            double denta=(b*b)-4*a*c;
            if(denta<0)
                System.out.print("Phuong trinh vo nghiem");
            else
                if(denta==0)
                {
                    double x=-b/(2*a);
                    System.out.printf("Nghiem kep cua phuong trinh la:x=%.2f ",x);
                }   
                else
                { 
                    double x1=(-b +Math.sqrt(denta))/(2*a);
                    double x2=(-b-Math.sqrt(denta))/(2*a);
                    System.out.printf("Nghiem cua phuong trinh:x1=%.2f , x2=%.2f",x1,x2);
                }
            
        }
        scanner.close();
    }
}