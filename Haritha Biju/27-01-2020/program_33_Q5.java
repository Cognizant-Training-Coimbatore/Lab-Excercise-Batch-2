package demo;

import java.util.Scanner;

public class program_33_Q5
{

	public static void main(String[] args)
	{
		int marks;
		System.out.println("enter the mark");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks<0)
			throw new ArithmeticException("Invalid mark entered.");
		else
			System.out.println("Valid Input.");


	}

}
