package project1;

import java.util.Scanner;

public class prgd31_q6_even_odd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}

}
