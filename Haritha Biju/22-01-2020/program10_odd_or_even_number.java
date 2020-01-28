package demo;

import java.util.Scanner;

public class program10_odd_or_even_number 
{

	public static void main(String[] args)
	{
		float num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num=sc.nextFloat();
		if(num%2==0)
			System.out.println(" The entered number is even ");
		else
			System.out.println(" The entered number is odd ");
			

	}

}
