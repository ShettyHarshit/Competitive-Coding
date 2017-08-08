import java.util.Scanner;

class TeamFormationForSnackdown {
	public static void main(String[] args) {

		int t,n,m,i;

		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		while (t != 0) {

			n = sc.nextInt();
			m = sc.nextInt();

			int u[] = new int[m];
			int v[] = new int[m];
			for(i=0;i<m;i++){

				u[i] = sc.nextInt();
				v[i] = sc.nextInt();
			}

			n = n-(2*m);
			if(n%2==0){
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			t--;
		}
	}
}