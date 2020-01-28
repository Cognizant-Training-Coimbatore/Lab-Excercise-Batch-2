import java.util.Scanner;

public class exercise10_divisibility7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		if(n%7==0)
			System.out.println("number is divisible by 7");
		else
			System.out.println("number is not divisible by 7");
			

	}

}
