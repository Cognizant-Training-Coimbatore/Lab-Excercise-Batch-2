package demo3;

import java.util.Scanner;

public class ques4
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		try
		{
			int[] a = new int[5];
			a[5]=n;
			System.out.println(a[6]/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Thrown "+e);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Thrown "+e);
			
		}
		finally
		{
		System.out.println(n/2);
		}

	}

}
