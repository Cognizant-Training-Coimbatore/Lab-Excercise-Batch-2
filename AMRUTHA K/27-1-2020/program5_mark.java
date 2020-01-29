package packss;

import java.util.Scanner;

public class program5_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x= sc.nextInt();
		if(x<0) {
			throw new ArithmeticException("exception throw");
		}
		else
			System.out.println("true");

	}

}
