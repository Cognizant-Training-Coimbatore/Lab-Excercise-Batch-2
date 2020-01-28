package demo;

import java.util.Scanner;

public class program_33_Q1
{

	public static void main(String[] args)
	{
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0)
			throw new ArithmeticException("Invalid input. The entered number is negative");
		else
			System.out.println("Valid Input.");

	}

}
