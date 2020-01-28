import java.util.Scanner;

public class program7_area_circle {

	public static void main(String[] args) {
		double r,a;
		final double pie = 3.14;
		System.out.println("Enter the radius");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextDouble();
		a=pie*r*r;
		System.out.println("The area of circle is " +a);
	}

}
