import java.util.Scanner;

public class program7_area_of_circle {

	public static void main(String[] args) {
		double radius,area;
		double pie=3.14;
		System.out.println("enter the radius");
		Scanner sc=new Scanner(System.in); 
		radius = sc.nextInt();
		area = pie*radius*radius;
		System.out.println("the area is " + area);

	}

}
