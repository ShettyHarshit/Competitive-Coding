import java.util.Scanner;
import java.lang.Math;
//Problem statement at codechef.com/problems/SNELECT

class Solution{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String a = sc.nextLine();
		for(int i1=0;i1<t;i1++){
			StringBuilder s = new StringBuilder(sc.nextLine());
			int l = s.length();
			
			for(int i=0;i<l;i++){
				if(s.charAt(i)=='m'){
					if((i-1)>=0 && s.charAt(i-1)=='s')s.setCharAt(i-1,'e');
				    else if(i+1<l && s.charAt(i+1)=='s')s.setCharAt(i+1,'e');
				}
			}			
			int counts=0;
			int countm=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='m')countm++;
				if(s.charAt(i)=='s')counts++;
			
			}
			if(counts>countm)System.out.println("snakes");		
			else if(counts<countm)System.out.println("mongooses");
			else System.out.println("tie");
		}
		
	
	}
} 