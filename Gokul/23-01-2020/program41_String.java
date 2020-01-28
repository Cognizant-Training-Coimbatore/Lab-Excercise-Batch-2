package gokul;

import java.util.Scanner;

class StringHandler
{
	void length(String s)
	{
		String n=s;
		System.out.println("The length of the string "+n.length());
	}
	void uppercase(String s)
	{
		String n=s;
		System.out.println("String uppercase "+n.toUpperCase());
	}
}

public class program41_String 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
        StringHandler str=new StringHandler();
        str.length(s);
        str.uppercase(s);
	}

}
