package javatest;

import java.util.Scanner;

public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enetr the side of hexagon\t:\t");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Area of Hexagon\t:\t"+(6*a*a/4*Math.tan(3.14/6)));

	}

}
