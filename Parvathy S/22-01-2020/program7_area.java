import java.util.Scanner;

public class program7_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		double r= sc.nextDouble();
		double p=3.14;
		double area;
		area= p*r*r;
		System.out.println("Area = "+area);
		

	}

}
