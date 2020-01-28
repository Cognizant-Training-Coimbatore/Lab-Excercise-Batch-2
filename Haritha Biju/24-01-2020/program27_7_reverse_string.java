package demo;

import java.util.Scanner;

public class program27_7_reverse_string
{

	public static void main(String[] args) 
	{
		String word;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word: ");
		word=sc.next();
		int l=word.length();
		System.out.print("The reverse of the word is: ");
		for(int i=(l-1);i>=0;i--)
			System.out.print(word.charAt(i));
			
	}

}
