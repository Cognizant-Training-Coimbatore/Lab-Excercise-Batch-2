package day5;

import java.util.Scanner;

public class Q5 {

	static void validate()throws myexceptions
	{
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Mark");
		mark=sc.nextInt();
		if(mark<=0)
		throw new myexceptions("Invalid mark entered");
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
