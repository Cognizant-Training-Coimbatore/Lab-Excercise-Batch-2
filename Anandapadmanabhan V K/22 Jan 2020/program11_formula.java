import java.util.Scanner;

public class program11_formula {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		c=((a+b)*(a+b));
		System.out.println("(a+b)^2= " + c);
		
	}

}
