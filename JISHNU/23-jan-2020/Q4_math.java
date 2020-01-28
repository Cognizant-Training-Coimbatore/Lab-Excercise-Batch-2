package Jishnu;

import java.util.Scanner;

class math
{
	
	void addition(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition: "+add);
	}
	void subtraction(int a,int b)
	{
		int mult=a-b;
		System.out.println("subtraction: "+mult);
	}
	void multiplication(int a,int b)
	{
		int multiplication=a*b;
		System.out.println("multiplication: "+multiplication);
	}
	void division(int a,int b)
	{
		float division=a/b;
		System.out.println("division: "+division);
	}
	
}
public class Q4_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		math obj=new math();
		int c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		c=sc.nextInt();
		d=sc.nextInt();
		obj.addition(c,d);
		obj.subtraction(c,d);
		obj.multiplication(c,d);
		obj.division(c,d);
	}

}
