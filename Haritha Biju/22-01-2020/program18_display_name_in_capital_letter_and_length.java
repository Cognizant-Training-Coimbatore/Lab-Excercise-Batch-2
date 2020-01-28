package demo;

import java.util.Scanner;

public class program18_display_name_in_capital_letter_and_length 
{
	public static void main(String[] args) 
	{		String name;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name :");
			name=sc.next();
			name=name.toUpperCase();
			System.out.println("Your name is "+name+" and contains "+name.length()+" letters. ");
			
	}
}
