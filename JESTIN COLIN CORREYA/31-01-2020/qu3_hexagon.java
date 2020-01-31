package java50;

import java.util.Scanner;

import java.lang.*;

public class qu3_hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter length:");
Scanner s= new Scanner(System.in);
int a=s.nextInt();

double ar=((6*a*a)/(4*Math.tan(Math.PI/6)));
System.out.println("area="+ar);
	}

}
