import java.util.Scanner;

public class program_7_circle_area
{

	public static void main(String[] args)
	{
		final double pie = 3.14;
		double r,area;
		System.out.println("Enter the radius");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		area=pie*r*r;
		System.out.println("The area is" + area);
		
		
		// TODO Auto-generated method stub

	}

}
