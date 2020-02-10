import java.util.Scanner;

public class lab3_areaof_hexagon {

	public static void main(String[] args) {
		double s,area;
		System.out.println("Enter the length of side of the hexagon");
		Scanner sc=new Scanner(System.in);
		s=sc.nextDouble();
		area=(6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.println("Area of hexagon : "+area);
	}

}
