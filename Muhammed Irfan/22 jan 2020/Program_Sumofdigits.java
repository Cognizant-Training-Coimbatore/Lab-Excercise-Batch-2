package demo;

import java.util.Scanner;

public class Program_Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int n=a, s=0,c;
		while(a>0)
		{
			c=a%10;
			s=s+c;
			a=a/10;		
		}
		System.out.print("Sum of the digits of "+n+" is "+s);
	}
	

}
