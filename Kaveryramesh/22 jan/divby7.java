package demo;

import java.util.Scanner;

public class divby7 {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		 x=s.nextInt();
		 if(x%7==0)
		 {
			 System.out.println("divisible");
		 }
		 else
			 System.out.println("not divisible");

	}

}
