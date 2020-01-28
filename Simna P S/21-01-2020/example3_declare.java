import java.util.Scanner;

public class example3_declare 
{

	public static void main(String[] args) 
	{
		final double pie = 3.14;
		double r,area;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Radius");
		r = scanner.nextInt();
		area = pie*r*r;
		System.out.println("The area of the circle is "+ area);
	}

}
