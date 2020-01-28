package gokul;

import java.util.Scanner;

public class program55_vowel_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
				count++;
			
		}
		System.out.println("Number of vowels in the word = "+count);
		
	}

}
