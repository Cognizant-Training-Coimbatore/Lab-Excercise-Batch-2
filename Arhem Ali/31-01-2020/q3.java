package java50;

import java.util.Scanner;
import java.lang.Math;


public class q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side of hexagon: ");
		int s=sc.nextInt();
		double f=Math.PI/6;
		System.out.println("area: "+(6*s*s)/(4*Math.tan(f)));

	}

}
