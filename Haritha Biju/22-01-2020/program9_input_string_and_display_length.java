package demo;

import java.util.Scanner;

public class program9_input_string_and_display_length
{

	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		str =sc.next();
		int length=str.length();
		System.out.println("The entered word is "+str+" of length "+length);
	}

}
