package demo;

import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
	   System.out.println("Enter a number");
	   a=s.nextInt();
	   System.out.println("Enter 2nd number");
	   b=s.nextInt();
	   c=((a*a)+(b*b)+(2*a*b));
	   System.out.println("result is "+c);
	}

}
