package day5;

import java.util.Scanner;

public class Q4 {

	static void validate()
	{
		int a[]=new int[5];
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		number1=sc.nextInt();
		number2=sc.nextInt();
		int result;
		result=number1/number2;
		a[5]=result;
		System.out.println(a[5]);
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		finally
		{
			System.out.println("Hello");
		}
	}
}
