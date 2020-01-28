import java.util.Scanner;

public class pgm_areaof_circle {

	public static void main(String[] args) 
	{
		double radius;
		double area;
		final double pie=3.14;
		System.out.println("enter the radius: ");
		Scanner scanner = new Scanner(System.in);
		radius = scanner.nextDouble();
		area=pie*radius*radius;
		System.out.println("the area is: "+area);
	}

}
