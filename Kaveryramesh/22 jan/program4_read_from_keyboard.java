package demo;

import java.util.Scanner;

public class program4_read_from_keyboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		System.out.println("Enter the value for x");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		System.out.println("The value of x is "+x);

	}

}
