package java50programs;

import java.util.Scanner;

public class q11 {
	

	public static void main(String[] args)
	{
		System.out.println("enter your number");
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		double i=Math.log(num)/Math.log(4);
		if(i==Math.floor(i))
		{
			System.out.println("number is a power of 4");
		}
		else
		{
			System.out.println("");
		}
	}

}
