import java.util.Scanner;

public class pgm7_area {

	public static void main(String[] args) {
		final double pi = 3.14;
		double ar;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=sc.nextInt();
		ar = pi * r * r ;
		System.out.println("Area of the circle is :"+ar);
	}

}
