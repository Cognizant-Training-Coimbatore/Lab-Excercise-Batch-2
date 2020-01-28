package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_Q8 {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.toLowerCase();
		int n=str.length();
//		String[] a=str.split(",");
//		for(i=0;i<str.length();i++)
//            System.out.print(Arrays.toString(a));
		int count=0;
		for(i=0;i<n-1;i++)
		{
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
			{
				count=count+1;
			}	
		}
		
		System.out.println("number of vowels is "+count);
	}

}
