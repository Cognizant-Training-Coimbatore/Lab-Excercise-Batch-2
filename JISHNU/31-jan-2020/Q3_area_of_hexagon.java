import java.lang.Math;
import java.util.Scanner;
public class Q3_area_of_hexagon {
	double area (float s)
	{
		double area=(6*s*s)/(4*Math.tan(Math.PI/6));
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of hexagon side");
		Scanner sc=new Scanner(System.in);
		float l=sc.nextFloat();
		Q3_area_of_hexagon obj=new Q3_area_of_hexagon();
		double area=obj.area(l);
		System.out.println("Area of hexagon: "+area);
		
	}

}
