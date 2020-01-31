package javatest;

import java.util.Scanner;

public class qstn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Number	->	");
		n=s.nextInt();
		if(n%2==0)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
