package abc;

import java.util.Scanner;

public class date31_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double degrees=30,area;
		double radians = Math.toRadians(degrees); 
		double tanValue = Math.tan(radians); 
		 int a;
		 System.out.println("enter the side of hexagon");
		 Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		 area=((6*a*a)/(4*tanValue));
		 System.out.println("Area of hexagon = "+area);
	}

}
