package demo;

import java.util.Scanner;

public class ex2_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		
		str=s.nextLine();
		n=str.length();
		
	      String a="";
		for(i=n-1;i>=0;i--)
		{
		   a=a+str.charAt(i);
		}	
		
		if(a.compareTo(str)==0)
		{
			System.out.println("palliandrome");
		}
		else
			System.out.println("Not palliandrome");
	}

}
