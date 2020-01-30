import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) 
	{
		double pi=3.14, A, r;
		System.out.println("Enter the value for r");
		Scanner scanner = new Scanner(System.in);
		r=scanner.nextInt();
		A=pi*r*r;
		System.out.println("Area of the circle is " + A);
		

	}

}
