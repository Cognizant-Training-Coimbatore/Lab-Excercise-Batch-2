package demo;

import java.util.Scanner;

/*Write a program to print the results of two numbers by addition, subtraction,
  multiplication, division by creating a class by creating methods of each operations.
  Pass the parameters to the method which needs to be entered through keyboard*/
 class calci
 {
	 void add(double x,double y)
	 {
		 System.out.println("Sum 		= "+(x+y));
	 }
	 void subtract(double x,double y)
	 {
		 System.out.println("Difference      = "+(x-y));
	 }
	 void multiply(double x,double y)
	 {
		 System.out.println("Product 	= "+(x*y));
	 }
	 void divide(double x,double y)
	 {
		 System.out.println("Quotient 	= "+(x/y));
	 }
 }
public class program22d_class_calculator 
{

	public static void main(String[] args)
	{	double a,b;
		calci obj=new calci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		obj.add(a, b);
		obj.subtract(a, b);
		obj.multiply(a, b);
		obj.divide(a,b);
		

	}

}
