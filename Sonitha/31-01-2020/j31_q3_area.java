import java.util.Scanner;

public class j31_q3_area {

	public static void main(String[] args) {
		
		double area;
		final double pi = (double) 3.14;
		System.out.println("Enter the length of the hexagon");
		Scanner sc = new Scanner(System.in);
		double s = sc.nextInt();
		area = (Math.sqrt(s)*6)*(4*Math.tan(pi/6));
		
		System.out.println(area);

	}

}
