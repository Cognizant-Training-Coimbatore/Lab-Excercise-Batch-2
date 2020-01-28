import java.util.Scanner;

public class program11_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		double s=0;
		s=(Math.pow(a,2))+(2*a*b)+(Math.pow(b,2));
		System.out.println("Sum of square of 2 numbers"+s);
		

	}

}
