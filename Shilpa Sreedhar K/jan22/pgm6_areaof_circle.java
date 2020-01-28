import java.util.Scanner;

public class pgm6_areaof_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double pie = 3.14, area;
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter radius of circle:");
		  r = s.nextInt();
		  area = pie * r * r;
		  System.out.println("Area of circle:" + area);
		
		

	}

}
