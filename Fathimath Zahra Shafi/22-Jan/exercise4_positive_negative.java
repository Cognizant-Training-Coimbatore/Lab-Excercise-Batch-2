import java.util.Scanner;

public class exercise4_positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		if(n>=0)
			System.out.println("number is positive");
		else
			System.out.println("number is negative");

	}

}
