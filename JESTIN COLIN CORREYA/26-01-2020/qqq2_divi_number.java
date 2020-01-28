package demo;

import java.util.Scanner;

public class qqq2_divi_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
Scanner s=new Scanner(System.in);
System.out.println("enter 2 numbers:");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("the first number="+a);
int c=a/b;
	System.out.println("second number="+b);
		}
catch (ArithmeticException e)
{
	System.out.println(e);
}



	}

}

