package demo;

import java.util.Scanner;

public class program11_square_of_sum_of_two_numbers
{

	public static void main(String[] args) 
	{
		float num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		System.out.println("The Square of sum of the two numbers is "+ Math.pow(num1+num2,2));
		

	}

}
