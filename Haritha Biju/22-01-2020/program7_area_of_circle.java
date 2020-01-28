package demo;

import java.util.Scanner;

public class program7_area_of_circle 
{

	public static void main(String[] args) 
	{	final double pi=3.14;
		float radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for radius of the circle in cm");
		radius=sc.nextFloat();
		System.out.println("The Area of the circle = "+pi*radius*radius+" sq.cm");

	}

}
