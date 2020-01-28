package demo;

import java.util.Scanner;

public class program8_check_for_positive_or_negative_number
{

	public static void main(String[] args) 
	{
		float number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextFloat();
		if(number!=0)
		{
			if(number>0)
				System.out.println("The entered number is positive");
			else
				System.out.println("The entered number is negative");
		}
		else
			System.out.println("The entered number is zero");
	}
		

}
