package demo;

import java.util.Scanner;

/*Write a program to print the area of a rectangle by creating a class named 'Area'
taking the values of its length and breadth as parameters of method and having a method 
named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle 
are entered through keyboard*/

class Area
{
	double l,b;
	Area(double x,double y)
	{	l=x;
		b=y;
	}
	double returnArea()
	{
		return l*b;
	}
}

public class program22c_class_area_of_rectangle
{

	public static void main(String[] args)
	{	double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length in cm :");
		a=sc.nextDouble();
		System.out.println("Enter the breadth in cm :");
		b=sc.nextDouble();
		Area tr=new Area(a,b);
		System.out.println(" The area of the rectangle :"+tr.returnArea()+" sq.cm");
		
		
	}

}
