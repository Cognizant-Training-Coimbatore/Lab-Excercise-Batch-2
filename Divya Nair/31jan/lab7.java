package project1;

import java.util.Scanner;

public class lab7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the starting limit:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("Enter the end limit:");
		
		int b=in.nextInt();
		System.out.println("Divisible by 3:");
		for(int i=a;i<=100;i++)
		{
			
			if(i%3==0)
			{
				System.out.println("\n"+i);
			}
		System.out.println("Divisible by 11:");
		for(int j=a;j<=100;j++)
			{
			if(j%11==0)
				{
				System.out.println("\n"+j);
				}
			}
		System.out.println("Divisible by 3 and 11:");
		for(int k=a;k<=100;k++)
		{
			if(k%3==0 && k%11==0)
			{
				System.out.println("\n"+k);
			}
				

	}

	}
}
}
