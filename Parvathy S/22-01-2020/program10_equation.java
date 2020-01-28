import java.util.Scanner;

public class program10_equation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=(a*a)+(2*a*b)+(b*b);
		System.out.println("Result= "+c);

	}

}
