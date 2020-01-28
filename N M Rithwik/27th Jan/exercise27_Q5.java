import java.util.Scanner;

public class exercise27_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mark : ");
		n = sc.nextInt();
		if(n<0)
			throw new ArithmeticException("Invalid marks entered");
	}

}
