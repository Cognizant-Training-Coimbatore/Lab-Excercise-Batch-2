package demo;

import java.util.Scanner;

public class Divisibleby7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		if(a%7==0)
		{
			System.out.print(a+" is divisible 7");
		}
		else
		{
			System.out.print(a+" is not divisible 7");
		}
	}
