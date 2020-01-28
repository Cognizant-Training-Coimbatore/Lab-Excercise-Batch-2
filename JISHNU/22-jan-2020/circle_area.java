package demo;

import java.util.Scanner;

public class circle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float pi=3.14f;
		System.out.println("Enter radius");
		Scanner scanner=new Scanner(System.in);
		float r=scanner.nextFloat();
		float area=pi*r*r;
		System.out.println("Area of the circle= "+area);
	}

}
