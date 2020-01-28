package demo;

import java.util.Scanner;

public class qqq3_nullpointer {

	public static void main(String[] args) throws NullPointerException
	
	{
		// TODO Auto-generated method stub
		try
		{
System.out.println("enter string:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int b=a.length();
		System.out.println("length="+b);
		if(b==0)
		{
			throw new NullPointerException();
		}
	}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}

}

}