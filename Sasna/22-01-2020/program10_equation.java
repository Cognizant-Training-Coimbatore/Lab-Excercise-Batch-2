import java.util.Scanner;

public class program10_equation {

	public static void main(String[] args) {
		double a,b,ans;
		System.out.println("enter the value for a");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("enter the value for b");
		b = sc.nextInt();
		ans = a*a + 2*a*b + b*b;
		System.out.println("(a + b)*(a + b) = " + ans);

	}

}
