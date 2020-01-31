import java.util.Scanner;
import java.lang.Math; 
public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side length of hexagon");
		double s=sc.nextDouble();
		double area=(6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.println(area);
	}

}
