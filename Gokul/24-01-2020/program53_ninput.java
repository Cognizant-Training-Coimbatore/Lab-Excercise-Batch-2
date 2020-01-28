package gokul;

import java.util.Scanner;

public class program53_ninput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number. Enter -999 to exit");
		int n=sc.nextInt();
		while(n!=-999)
			{
			System.out.println("Enter next number. Enter -999 to exit");
			
			n=sc.nextInt();
			
			}
		
		System.out.println("Program exited");

	}

}
