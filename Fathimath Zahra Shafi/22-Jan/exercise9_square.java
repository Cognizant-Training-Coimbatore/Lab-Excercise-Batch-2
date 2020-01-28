import java.util.Scanner;

public class exercise9_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, square=0;
		System.out.println("enter a number");
		Scanner scanner= new Scanner(System.in);
		n=scanner.nextInt();
		square=n*n;
		System.out.println("square of the number: " +square);

	}

}
