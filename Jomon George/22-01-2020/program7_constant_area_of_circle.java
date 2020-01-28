import java.util.Scanner;

public class program7_constant_area_of_circle 
{

	public static void main(String[] args) 
	{
		final double pi=3.14;
		System.out.println("Enter the radius of the circle:");
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		System.out.println("Area of the circle:"+(pi*radius*radius));
		

	}

}
