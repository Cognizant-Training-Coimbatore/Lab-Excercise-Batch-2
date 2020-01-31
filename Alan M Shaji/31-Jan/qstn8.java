package javatest;

import java.util.Scanner;

public class qstn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if((b>a && c>b)||(c>a && c>b))
			System.out.println(true);
		else
			System.out.println(false);

	}

}
