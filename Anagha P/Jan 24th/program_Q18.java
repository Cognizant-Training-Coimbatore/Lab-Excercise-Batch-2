package demo;

import java.util.Scanner;

public class program_Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char b;
		int c=0,len,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.next();
		len=s.length();
		for(i=0;i<len;i++)
		{
			b=s.charAt(i);
			if(b =='a'||b =='e'||b == 'i'||b == 'o'||b == 'u')	
			{
				c++;
			}
		}
		System.out.println("no of vowels"+c);
		

	}

}
