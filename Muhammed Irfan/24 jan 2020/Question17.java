package demo;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		String a,b="";
		Scanner scan=new Scanner(System.in);
		a=scan.nextLine();
		int l=a.length();
		for(int i=l-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
	}

}
