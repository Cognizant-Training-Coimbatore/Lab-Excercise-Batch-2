import java.util.Scanner;
public class program7_circle_area {

	public static void main(String[] args) {
		double area,r = 0;
		final double pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle..");
		r=sc.nextDouble();
		area=pi*r*r;
		System.out.println("Area of the circle is.."+area);
		

	}

}
