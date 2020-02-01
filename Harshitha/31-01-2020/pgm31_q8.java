package Project;

import java.util.Scanner;

public class pgm31_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1= sc.nextInt();
		System.out.println("Enter number 2:");
		int n2= sc.nextInt();
		System.out.println("Enter number 3:");
		int n3= sc.nextInt();
		if(n2>n1 && n3>n2)
			System.out.println("true");
		else
			System.out.println("false");
}
	}


