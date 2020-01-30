package demo;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER");
		 Scanner s=new Scanner(System.in);
		 int n,r,sum=0;
		 n=s.nextInt();
		
		 while(n>0)
		 {
			 r=n%10;
			 n=n/10;
			
			 sum=sum+r;
		 }
		 System.out.println("sum is "+sum);

	}

}
