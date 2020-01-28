package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ex_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String temp;
		int i,n;
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		
		str=s.nextLine();
		n=str.length();
		
	      String a="";
		for(i=n-1;i>=0;i--)
		{
		   a=a+str.charAt(i);
		}	
//		for(i=0;i<str.length();i++)
			System.out.print(a);
		

	}

}
