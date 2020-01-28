package day5;

import java.util.Scanner;

public class Q2 {

	static void validate()
	{
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		number1=sc.nextInt();
		number2=sc.nextInt();
		int result;
		result=number1/number2;
		System.out.println(result);
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
	}

}
