import java.util.Scanner;

public class prgm8_positive {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		if(n>0)
		{
			System.out.println("The number is positive");
			
		}else
		{
			System.out.println("The number is negative");
		}

	}

}
