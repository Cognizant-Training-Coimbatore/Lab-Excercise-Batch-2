package Exercise;

import java.util.Scanner;

public class Q08_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input 3 numbers : ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		if((n2 > n1) && (n3 > n2))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
