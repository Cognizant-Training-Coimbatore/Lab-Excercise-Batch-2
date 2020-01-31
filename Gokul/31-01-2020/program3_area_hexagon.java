import java.util.Scanner;

public class program3_area_hexagon {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length of the side");
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		
		double area=(6*s*s)*(4*Math.tan(Math.PI/6));
		System.out.println("Area of a Hexagon="+area);
		
	}

}
