package project1;

import java.util.Scanner;

public class lab18 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=in.nextInt();
		System.out.println("Enter second number:");
		int b=in.nextInt();
		System.out.println("Enter third number:");
		int c=in.nextInt();
		if(a==b && a==c && b==c)
		{
			System.out.println("All are equal");
		}
		else if(a!=b && a!=c && b!=c)
		{
			System.out.println("All are different");
		}
		else
			System.out.println("Neither all are equal or different");
			
		

	}

}
