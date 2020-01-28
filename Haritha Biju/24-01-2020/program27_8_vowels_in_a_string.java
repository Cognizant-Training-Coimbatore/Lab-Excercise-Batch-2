package demo;

import java.util.Scanner;

// Write the java program to calculate no of vowels from the given string

public class program27_8_vowels_in_a_string 
{

	public static void main(String[] args) 
	{
		String word;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word: ");
		word=sc.next();
		int l=word.length();
		for(int i=0;i<l;i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
				count++;
		}
		
		System.out.println("The number of vowels in the entered string is : "+count);
	}

}
