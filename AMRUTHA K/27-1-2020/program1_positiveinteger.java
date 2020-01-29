package packss;

import java.util.Scanner;

public class program1_positiveinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>0) {
			System.out.println("number is"+x );
		}
		else
			throw new ArithmeticException("the number is negative");

	}

}
