import java.util.Scanner;

public class program7_area
{

	public static void main(String[] args)
	{
		final double p=3.14,a;
		int r;
		System.out.println("Enter the radius:");
		Scanner scanner=new Scanner(System.in);
		r=scanner.nextInt();
		a=p*r*r;
		System.out.println("The area of the circle is:"+a);
		
		
		

	}

}
