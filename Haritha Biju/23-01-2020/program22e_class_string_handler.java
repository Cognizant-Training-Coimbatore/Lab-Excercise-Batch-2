package demo;

import java.util.Scanner;

class string_handler
{
	int length(String str)
	{
		return str.length();
	}
	void lower(String str)
	{
		System.out.println("The word is: "+str.toLowerCase());
	}
}
public class program22e_class_string_handler
{
	public static void main(String[] args)
	{
		string_handler ob1=new string_handler();
		String string;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word :");
		string=sc.next();
		ob1.lower(string);
		System.out.println("The word contains "+ob1.length(string)+" charachters");
		
	}

}
