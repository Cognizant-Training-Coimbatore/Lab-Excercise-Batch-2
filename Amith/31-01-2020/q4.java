package java50programs;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) 
	{
		System.out.println("enter your string");
		String s;
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		int l=s.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
