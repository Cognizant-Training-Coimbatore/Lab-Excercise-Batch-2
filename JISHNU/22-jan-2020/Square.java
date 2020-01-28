package demo;

import java.lang.Math;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=Math.pow(a, 2)+2*a*b+Math.pow(b, 2);
		System.out.println("Square of sum: "+c);
	}

}
