package demo;

import java.util.Scanner;

public class program16_to_check_whether_the_number_is_divisible_by_7 
{

	public static void main(String[] args)
	{
		float number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextFloat();
		if(number%7==0)
			System.out.println("The number is divisible by 7");
		else
			System.out.println("The number is not divisible by 7");

	}

}
