package practical_exercises;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a number");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n%2==0)
			System.out.println("1");
		else
			System.out.println("0");

	}

}
