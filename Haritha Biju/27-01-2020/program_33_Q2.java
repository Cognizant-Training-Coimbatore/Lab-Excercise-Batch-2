package demo;

import java.util.Scanner;

public class program_33_Q2 
{

	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(b==0)
			throw new ArithmeticException("Division by zero is not defined");
		else
			System.out.println("the result of a/b="+(a/b));
	}

}
