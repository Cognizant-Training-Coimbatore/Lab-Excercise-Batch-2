package demo3;

import java.util.Scanner;

public class ques5 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("MARK IS ACCEPTED");
		}
		else
		{
			throw new ArithmeticException("INVALID MARK ENTERED");
		}
	

	}

}
