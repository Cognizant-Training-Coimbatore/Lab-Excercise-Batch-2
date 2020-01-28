import java.util.Scanner;

public class prgm7_area_circle {

	public static void main(String[] args) {
		final double pi = 3.14;
		System.out.println("Enter the radius of the circle :");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
         double area = (pi*r*r);
		System.out.println("The area of the circle is :" + area);

	}

}
