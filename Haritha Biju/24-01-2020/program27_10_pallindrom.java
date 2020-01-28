package demo;
//Write a java program which checks the string is palindrome or not

import java.util.Scanner;

public class program27_10_pallindrom
{

	public static void main(String[] args)
	{
		String word,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word: ");
		word=sc.next();
		int l=word.length();
		for(int i=(l-1);i>=0;i--)
		{	
			reverse=reverse+word.charAt(i);
		}
		if(word.equalsIgnoreCase(reverse))
			System.out.println("The entered word is a pallindrome.");
		else
			System.out.println("The entered word is not a pallindrome.");
		
		
	}

}
