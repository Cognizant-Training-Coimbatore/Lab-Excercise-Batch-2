import java.util.Scanner;

public class exercise27_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		if(n<0)
			throw new ArithmeticException("negative value");
		else 
			System.out.println("The input is valid");
	}

}
