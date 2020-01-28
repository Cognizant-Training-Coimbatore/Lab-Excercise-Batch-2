import java.util.Scanner;

public class p2_formula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter another number");
		int b = sc.nextInt();
		
		int c = (a*a)+(2*a*b)+(b*b);
		System.out.println("The result is :"+ c);

	}

}
