package demo;

import java.util.Scanner;

public class program17_sum_of_odd_numbers_from_5_numbers
{	public static void main(String[] args) 
	{
		int x[]=new int[5];
		int s = 0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		for(int i=0;i<5;i++)
		{	x[i]=sc.nextInt();
			if(x[i]%2!=0)
				s+=x[i];
		}
		System.out.println("Sum of the odd numbers = "+s);
		
	}
}
