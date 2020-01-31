import java.util.Scanner;

public class assessment_q3_31_area_hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		double area;
		System.out.println("Enter the length of hexagon:");
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextInt();
		area=((6*s*s)/(4*Math.tan(3.14/6)));
		System.out.println(+ area);
		
		

	}

}
