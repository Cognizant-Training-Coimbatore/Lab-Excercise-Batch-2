import java.util.Scanner;

public class program5_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double x= 3.14;
		int y;
		System.out.println("Enter the value of y");
		Scanner scanner=new Scanner(System.in);
		y=scanner.nextInt();
		double result=x*y*y;
		System.out.println("Area of circle : " +result);
				
		

	}

}
