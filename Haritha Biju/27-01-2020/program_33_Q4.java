package demo;

import java.util.Scanner;

public class program_33_Q4
{

	public static void main(String[] args) 
	{
		try
		{
			int a,b;
			int array[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			array[5]=(a/b);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Array index out of bound");
		}
		finally
		{
			System.out.println("enter a valid data");
		}
	}

}
