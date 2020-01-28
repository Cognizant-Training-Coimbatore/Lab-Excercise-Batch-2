import java.util.Scanner;

public class program7_area_of_circle 
{

	public static void main(String[] args) 
	{
		float r;
		double area;
		final double y=3.14;
		System.out.println("The radius of the circle is :" );
		Scanner sc= new Scanner(System.in);
		r =sc.nextFloat();
		area= y*r*r;
		System.out.println("The area of circle ="+ area);
		
		
				
	}

}
