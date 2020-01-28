package demo;

import java.util.Scanner;

public class CountnoOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter number");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		int count=0;
		if(a%2==1)
		{
			 count++;
		}
		if(b%2==1)
		{
			 count++;
		}
		if(c%2==1)
		{
			 count++;
		}
		if(d%2==1)
		{
			 count++;
		}
		if(e%2==1)
		{
			 count++;
		}
		System.out.print("Number of odd numbers are  "+count);
	}

}
