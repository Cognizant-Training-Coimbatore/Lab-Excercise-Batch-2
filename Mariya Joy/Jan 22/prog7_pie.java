import java.util.Scanner;

public class prog7_pie {

	public static void main(String[] args) 
	{
		final double y=3.14;
		int r;
		double Area;
		{
			System.out.println("Enter the radius of circle");
			Scanner scanner=new Scanner(System.in);
			r=scanner.nextInt();
			Area=y*r*r;
			System.out.println("The area of circle is "+Area);
			
		}
		// TODO Auto-generated method stub

	}

}
