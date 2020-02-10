package java50programs;

import java.util.Scanner;

public class q18 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b&&a==c&&b==c)
		{
			System.out.println("all numbers are equal");
		}
		else
		{
			System.out.println("all numbers are different");
		}
		
			

	}

}
