package project1;

import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the starting limit:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("Enter the end limit:");
		int b=in.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				System.out.println("\n"+i);
			}
		}
		

	}

}
