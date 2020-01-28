package demo;

import java.util.Scanner;

public class program11_absqure {

	public static void main(String[] args) {
		int s=0;
		System.out.println("enter a&b");
		for(int i=0;i<2;i++) {
			
			Scanner a=new Scanner(System.in);
			int x=a.nextInt();
		      s=s+x;
		      
			
		}
		System.out.println("(a+b)*2="+s*s);
		

	}

}
