package demo;

import java.util.Scanner;

public class program_Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,r="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			r=r+s.charAt(i);
			
		}
		if(s.equals(r))
		{
			System.out.println("string is pallindrome");
		}
		else
			System.out.println("not pallindrome");

	}

}
