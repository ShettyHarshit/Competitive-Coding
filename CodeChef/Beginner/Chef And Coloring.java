import java.util.Scanner;
import java.lang.Math;
//Problem statement at codechef.com/problems/COLOR

class TableTennis
{
    public static void main(String[] args) {

		int t,n,m, i;

		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		while (t != 0) {
			int  r=0, g=0, b=0;
			n = sc.nextInt();
			String s = sc.next();
			int l=s.length();
			for(i=0;i<n;i++){
				if(s.charAt(i)=='R')
					r++;
				else if(s.charAt(i)=='G')
					g++;
				else
					b++;
			}
			int p = Math.max(Math.max(r,g),b);
			int q=n-p;
			System.out.println(q);
			t--;
		}
	}
} 