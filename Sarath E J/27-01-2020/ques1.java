package demo3;

import java.util.Scanner;

public class ques1
{
	
		
	public static void main(String[] args)
	{	
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("input is valid");
		}
		else
		{
			throw new ArithmeticException("SORRY INVALID INPUT");
		}
	
	}

}
