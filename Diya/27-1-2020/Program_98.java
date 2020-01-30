  
import java.util.Scanner;

public class Program_98 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mark : ");
		n = sc.nextInt();
		if(n<0)
			throw new ArithmeticException("Invalid marks entered");
	}

}