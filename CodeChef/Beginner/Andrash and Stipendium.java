import java.util.Scanner;
//Problem statement at codechef.com/problems/EGRANDR
class AndrashAndStipendium {
    public static void main(String[] args) {
 
        int t,n,i,flag;
        double avg;
 
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
 
        while(t!=0){
 
            flag = 0;
            avg = 0.0;
            n = sc.nextInt();
 
            int a[] = new int[n];
            for(i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
 
            for(i=0;i<n;i++){
 
                if(a[i] == 5){
                    flag = 1;
                    avg = avg+a[i];
                }
                else if(a[i] == 3 || a[i] == 4){
                    avg = avg+a[i];
                }
                else{
                    flag = 0;
                    break;
                }
            }
 
            avg = avg/n;
            if(flag == 1 && avg>=4.0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
    }
}