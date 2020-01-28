package demo;

import java.util.Scanner;

public class Question4_exception {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int n1,n2,res;
		System.out.println("enter the number");
		n1=sc.nextInt();
		System.out.println("enter the number");
		n2=sc.nextInt();
		try
		{
			res=n1/n2;
			//arr[6]=res;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic Exception occurs");
		}
		try
		{
			
			//res=n1/n2;
			arr[6]=n1/n2;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exception occurs");
		}
		catch(Exception e )
		{
			System.out.println("{parent exception occurs");
		}
		finally
		{
			
			System.out.println("finally statement executed");
		}

	}

}
