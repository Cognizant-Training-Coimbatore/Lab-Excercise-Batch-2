import java.util.Scanner;
import java.lang.Math;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the side");
		double s= sc.nextDouble();
	    double a;
	    
	    a = (6*s*s)/(4*Math.tan(3.14/6));
		System.out.println("Area of the hexagon = "+a);

	}

}
