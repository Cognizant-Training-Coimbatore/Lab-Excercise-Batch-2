package demo;

import java.util.Scanner;

public class Question2_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,res;
		System.out.println("enter the number");
		n1=sc.nextInt();
		System.out.println("enter the number");
		n2=sc.nextInt();
		try
		{
			res=n1/n2;
			System.out.println("result is"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		


	}

}
