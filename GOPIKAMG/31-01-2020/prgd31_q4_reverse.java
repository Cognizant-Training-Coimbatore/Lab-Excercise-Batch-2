package project1;

import java.util.Scanner;

public class prgd31_q4_reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int l=str.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The reversed string is " +rev);

	}

}
