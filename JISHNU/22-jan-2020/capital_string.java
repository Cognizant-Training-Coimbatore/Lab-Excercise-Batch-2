package demo;

import java.util.Scanner;

public class capital_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String cap=str.toUpperCase();
		System.out.println(cap);
		int a=str.length();
		System.out.println("Length of name= "+a);
		
		
	}

}
