package demo;

import java.util.Scanner;

public class Question5_exception {
	static void check(int n)
	{
		if(n<0)
		{
			throw new ArithmeticException("not accepted");
		}
		else
		{
			System.out.println("accepted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,mark;
		//int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
			mark=sc.nextInt();
			check(mark);
		
		
		

	}

}
