import java.util.Scanner;
 class ATM
 {
 public static void main(String[]args)
 {
 Scanner s=new Scanner(System.in);
   int a=s.nextInt();
    double b=s.nextDouble();
            if(a%5==0)
            {
                if(b>=(a+0.50))
                System.out.println(b-(a+0.50));
                else
                System.out.println(b);
            }
                else
                System.out.println(b);
     }
    }