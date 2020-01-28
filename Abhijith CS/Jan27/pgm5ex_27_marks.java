package exceptionhandling;

import java.util.Scanner;

public class pgm5ex_27_marks {
	static void mark(int num)
	{
		if (num>=0)
		{
			System.out.println("Mark is valid");
		}
		else
		{
			throw new ArithmeticException("Invalid mark...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark");
		int num=sc.nextInt();
		mark(num);
		sc.close();
		}

}
