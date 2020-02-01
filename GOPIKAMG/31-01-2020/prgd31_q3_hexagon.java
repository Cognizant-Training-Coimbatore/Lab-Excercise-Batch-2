package project1;

import java.util.Scanner;

public class prgd31_q3_hexagon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of side");
		double s=sc.nextDouble();
		double area;
		area=(6*(s*s))/(4*Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon is :" +area);
	}

}
