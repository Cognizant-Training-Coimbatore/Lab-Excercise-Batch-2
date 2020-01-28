import java.util.Scanner;

public class prgm18_divisible_by_seven {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	if(n%7==0) {
		System.out.println("The number is divisible by seven");
	}else {
		System.out.println("The number is not divisible by seven");
	}

	}

}
