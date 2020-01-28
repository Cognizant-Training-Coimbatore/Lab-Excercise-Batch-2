package demo;

import java.util.Scanner;

public class Program_squreof2number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter two numbers");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int s=a*a+b*b+2*a*b;
		System.out.print("(a+b)^2 =  "+s);
	}

}
