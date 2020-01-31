package project1;

import java.util.Scanner;

public class lab8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=in.nextInt();
		System.out.println("Enter the second number:");
		int b=in.nextInt();
		System.out.println("Enter the third number:");
		int c=in.nextInt();
		if(b>a&&c>b)
		{
			System.out.println("True");
		}
		else
			System.out.println("false");
			
		
		

	}

}
