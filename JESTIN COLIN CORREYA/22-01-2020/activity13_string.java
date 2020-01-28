package demo;

import java.util.Scanner;

public class activity13_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter your name:");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=a.toUpperCase();
		int c=b.length();
		System.out.println(b);
		System.out.println("length=:"+c);
		

	}

}
