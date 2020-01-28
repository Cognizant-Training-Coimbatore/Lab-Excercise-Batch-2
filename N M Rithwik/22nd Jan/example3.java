import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.14;
		double rad,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		rad = sc.nextDouble();
		area = pi*rad*rad;
		System.out.println("Area = " + area);
	}

}
