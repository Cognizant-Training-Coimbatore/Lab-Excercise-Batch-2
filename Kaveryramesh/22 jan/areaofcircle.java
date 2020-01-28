package demo;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		final double pie=3.14;
		double area,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		 r=s.nextInt();
		 area=pie*r*r;
		 System.out.println("The area is "+area);

	}

}
