package day5;

import java.util.Scanner;

public class Q1 {

	static void validate()throws myexceptions
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		if(number<=0)
		throw new myexceptions("not valid");
		else
			System.out.println("Valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate();
		}
		catch(Exception m) 
		{
			System.out.println("Exception occured: "+m);
		}
	}
}
