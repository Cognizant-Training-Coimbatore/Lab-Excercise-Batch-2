package demo;

import java.util.Scanner;

public class program14_nested_else_if_ladder 
{

	public static void main(String[] args) 
	{
			int marks;
			System.out.println("Enter your marks : ");
			Scanner sc=new Scanner(System.in);
			marks=sc.nextInt();
			if(marks>90)
				System.out.println("Grade: A");
			else if(marks>80)
				System.out.println("Grade: B");
			else if(marks>70)
				System.out.println("Grade: C");
			else if(marks>60)
				System.out.println("Grade: D");
			else
				System.out.println("Grade: Failed");
	

	}

}
