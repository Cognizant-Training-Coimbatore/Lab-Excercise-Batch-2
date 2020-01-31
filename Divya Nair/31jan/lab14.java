package project1;

import java.util.Scanner;

public class lab14 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x,y;
		double result;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		System.out.println("Enter the value of x:");
		x=in.nextInt();
		System.out.println("Enter the value of y:");
		y=in.nextInt();
		result=Math.pow(x, n)%y;
		System.out.println("x^n%y :"+result);
		
		

	}

}
