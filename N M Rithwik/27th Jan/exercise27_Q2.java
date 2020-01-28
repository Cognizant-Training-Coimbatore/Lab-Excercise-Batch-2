import java.util.Scanner;

public class exercise27_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		n = sc.nextInt();
		m = sc.nextInt();
		if(m==0)
			throw new ArithmeticException("Division by 0 not possible");
		else
			System.out.println("The answer is : " + n/m);
	}

}
