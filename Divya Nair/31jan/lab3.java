package project1;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int s;
		double area;
		double PI=3.14;
		
		
		System.out.println("Enter the side of the hexagon:");
		Scanner in=new Scanner(System.in);
		s=in.nextInt();
		area= (6 * s*s)/(4*Math.tan(PI/6));
		System.out.println("The area of hexagon is:"+area);
	}

}
