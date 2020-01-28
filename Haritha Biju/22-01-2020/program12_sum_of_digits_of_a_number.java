package demo;

import java.util.Scanner;

public class program12_sum_of_digits_of_a_number 
{

	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		int n=num;
		do
		{  
			sum=num%10+sum;
			num=num/10;
			
			
		}while(num!=0);
		System.out.println("The sum of the digits of the number "+n+" is "+sum);
		
	}

}
