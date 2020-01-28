import java.util.Scanner;
public class program7_circle_radius {

	public static void main(String[] args) {

		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextInt();
		double area=Math.PI*r*r;
		System.out.println("Area of the circle  :"+area);
		

	}

}
