import java.util.*;
//Problem statement at codechef.com/problems/RAINBOWA 
class CodeChef{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
			int n = s.nextInt();
			int a[] = new int[n];
			ArrayList<Integer> list = new ArrayList<Integer>();
 
			for(int i=0;i<n;i++)
				a[i] = s.nextInt();
 
			boolean ans = true;
 
			int i = 0, j = n - 1;
 
			while(i<=j && ans){
				if(a[i]!=a[j])
					ans = false;
				else{
					i++;
					j--;
				}
			}
 
			if(ans){
				list.add(a[0]);
				j = 0;
				for (i=1; i<n; i++) {
					if(list.get(j)!=a[i]){
						list.add(a[i]);
						j++;
					}
				}
 
				i = 0;
				j = list.size() - 1;
 				int count = 1;
 
				if( j+1 != 13)
					ans = false;
				else{
					while(i<=j && ans){
						if(list.get(i) != list.get(j) || list.get(i) != i + 1)
							ans = false;
						else{
							i++;
							j--;
						}
					}
				}
			}
 
			System.out.println(ans ? "yes" : "no");
 
 
 
 
		}
	}
}