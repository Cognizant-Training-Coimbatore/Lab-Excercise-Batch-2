package demo;

import java.util.Scanner;

public class program7_pie {

	public static void main(String[] args) {
		float p=(float)3.14;
		float x;
		System.out.println("enter the radius");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		float a=(float)p*x*x;
		
		System.out.println("radius is"+a);
	

	}

}
