package javatest;

import java.util.Scanner;

public class qstn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 3 number\t:\t");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b &&b==c)
			System.out.println("All numbers are equal");
		else if(a!=b &&b!=c)
			System.out.println("All numbers are not equal");
		else
			System.out.println("All numbers are neither equal nor different");
		

	}

}
