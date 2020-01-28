import java.util.Scanner;

public class j27_q1_acceptsOnlyPositiveNumber {
	
	static void pos(int x) {
	if(x>=0) {
		System.out.println("The entered number is : "+ x);
	}else
	{
		throw new ArithmeticException("Please enter a positive number.");
	}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n = sc.nextInt();
		pos(n);
	}

}
