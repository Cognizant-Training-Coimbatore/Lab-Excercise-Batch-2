import java.util.Scanner;

public class practice3_area_circle {

	public static void main(String[] args) 
	{
		final double pie = 3.14;
		double a;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		a=sc.nextDouble();
		area=2*pie*a*a;
		System.out.println("The area of the circle is " +area);
	
	}

}
