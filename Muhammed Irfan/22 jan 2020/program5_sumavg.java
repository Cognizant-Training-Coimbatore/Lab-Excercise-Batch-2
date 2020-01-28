package demo;

import java.util.Scanner;

public class program5_sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter 5 numbers");
		Scanner scan=new Scanner(System.in);
		int a,b,c,d,e,x,y;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		e=scan.nextInt();
		x=a+b+c+d+e;
		y=(a+b+c+d+e)/5;
		System.out.println("Sum of the numbers ="+x+"Average of the numbers = "+y);
	}

}
