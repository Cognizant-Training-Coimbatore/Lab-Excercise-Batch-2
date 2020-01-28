import java.util.Scanner;

public class program7_pi {

	public static void main(String[] args)
	
	{
		final float pi=3.14f;
		int r;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area="+area);
			
	}

}
