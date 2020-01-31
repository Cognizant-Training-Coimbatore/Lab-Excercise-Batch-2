package project1;

import java.util.Scanner;

public class lab6 {

	public static void main(String[] args) 
	{

		System.out.println("Enter a number: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%2==0)
		{
			System.out.println("1");
			
		}
		else
			
			System.out.println("0");
	}

}
