package demo;

import java.util.Scanner;

public class program6_sum_and_average_of_5_numbers
{

	public static void main(String[] args)
	{
		int x[]=new int[5];
		int s = 0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		for(int i=0;i<5;i++)
		{	x[i]=sc.nextInt();
			s= s+x[i];
		}
		avg=s/5;
		System.out.println("Sum of the 5 numbers = "+s);
		System.out.println("Average of the 5 numbers : "+avg);
	}

}
