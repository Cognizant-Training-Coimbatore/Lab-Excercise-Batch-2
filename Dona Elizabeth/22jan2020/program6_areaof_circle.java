import java.util.Scanner;

public class program6_areaof_circle {

	public static void main(String[] args) {
		final double pie=3.14;
		System.out.println("Enter the radius");
		Scanner radius=new Scanner(System.in);
		int r=radius.nextInt();
		double area=(pie*r*r);
		System.out.println("The area of circle is "+area);
	}

}
