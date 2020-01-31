package project1;

import java.util.Scanner;

public class lab11 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=in.nextInt();
		if(n%4==0)
		{
			System.out.println("TRUE");
			System.out.println("It is a power of 4");
			
		}
		else
			System.out.println("FALSE");
		
		

	}

}
