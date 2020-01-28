package demo;

import java.util.Scanner;

public class program15_find_the_square_of_a_number
{

	public static void main(String[] args)
	{
		float num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextFloat();
		System.out.println("The Square of the number is "+ Math.pow(num,2));
	}

}
