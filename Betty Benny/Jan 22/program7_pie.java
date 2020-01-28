import java.util.Scanner;

public class program7_pie
{

	public static void main(String[] args)
	{
		final double y=3.14;
		int r;
		double area;
		System.out.println("Enter the radius");
		Scanner scanner=new Scanner(System.in);
		r=scanner.nextInt();
		area=y*r*r;
		System.out.println("Area=" +area);
		// TODO Auto-generated method stub

	}

}
