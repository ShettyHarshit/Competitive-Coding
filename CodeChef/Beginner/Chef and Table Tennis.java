import java.util.Scanner;
//Problem statement at codechef.com/problems/TTENIS

class TableTennis
{
    public static void main(String[] args) {

		int t,n,m, i;

		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		while (t != 0) {
			int  c0=0, c1=0;
			String s = sc.next();
			int l=s.length();
			for(i=0;i<l;i++){
				if(s.charAt(i)=='0')
					c0++;
				else if(s.charAt(i)=='1')
					c1++;
			}
			if((c1>=11)&&(c1>=c0+2))
				System.out.println("WIN");
			else 
				System.out.println("LOSE");
			t--;
		}
	}
} 