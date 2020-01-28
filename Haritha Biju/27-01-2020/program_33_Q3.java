package demo;

import java.util.Scanner;

public class program_33_Q3
{

	public static void main(String[] args) 
	{
		String word;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		word=sc.next();
		if(word.length()==0)
			throw new NullPointerException("The entered word is null");
		else
			System.out.println("The word has "+word.length()+" charachters");
	}

}
