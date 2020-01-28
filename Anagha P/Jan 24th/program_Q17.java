package demo;

import java.util.Scanner;

public class program_Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
