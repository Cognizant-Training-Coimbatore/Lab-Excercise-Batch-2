import java.util.Scanner;

public class practice9_square {

	public static void main(String[] args) {
		int a=0;
		int square=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		square=a*a;
		System.out.println("Square of the " +a+ " is " +square);
	}

}
