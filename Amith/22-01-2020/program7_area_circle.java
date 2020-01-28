import java.util.Scanner;

public class program7_area_circle {

	public static void main(String[] args) 
	{
	 final double p=3.14;
	 int r;
	 double area;
	 System.out.println("enter the radius");
	 Scanner scanner= new Scanner(System.in);
	 r=scanner.nextInt();
	 area=p*r*r;
	 System.out.println("area is"+area);
	 

	}

}
