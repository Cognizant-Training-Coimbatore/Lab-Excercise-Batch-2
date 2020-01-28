package demo3;

import java.util.Scanner;

public class ques2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		double r = n/m;
		if(m!=0)
		{
			System.out.println("RESULT : "+r);
		}
		else
		{
			throw new ArithmeticException("ERROR ");
		}

	}

}
