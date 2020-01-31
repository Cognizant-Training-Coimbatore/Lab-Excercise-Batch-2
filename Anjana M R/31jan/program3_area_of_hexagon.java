import java.util.Scanner;

public class program3_area_of_hexagon {

	public static void main(String[] args) {
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the side  :");
		s=sc.nextInt();
		double area=(6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.println("Area of hexagon  :"+area);

	}

}
