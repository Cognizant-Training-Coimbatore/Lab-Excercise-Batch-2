package demo;

import java.util.Scanner;

public class qqq1_positive_number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter any positive number: ");
int a=s.nextInt();
if(a>0)
{
	System.out.println("the number is positive....");
}
else
{
	throw new ArithmeticException("invalid input... ");
}
	}

}
