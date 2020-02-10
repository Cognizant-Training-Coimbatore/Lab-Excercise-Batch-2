import java.util.Scanner;

public class ex3_area_hexagon {

	public static void main(String[] args)
	{
		double area;
		int s;
		System.out.println("Enter length ");
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextInt();
		
		area=(6*s^2)/(4*Math.tan(3.14/6));
		System.out.println("Area of hexagon is : " +area);
		
		
		
		
	

	}

}
