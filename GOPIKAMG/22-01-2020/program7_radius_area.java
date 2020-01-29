import java.util.Scanner;
public class program7_radius_area 
{

	public static void main(String[] args) 
	{
		final double pie=3.14;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("The area is " +area);

	}

}
