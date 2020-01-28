package demo;

import java.util.Scanner;

public class Question1_exception {
	static void check(int i)
	{
		if(i>0)
		{
			System.out.println("accepted");
		}
		else throw new ArithmeticException("not accepted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		check(n);
		

	}

}
