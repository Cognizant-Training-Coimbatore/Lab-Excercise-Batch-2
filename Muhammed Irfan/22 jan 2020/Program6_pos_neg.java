package demo;

import java.util.Scanner;

public class Program6_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		if(a>0)
		{
			System.out.print(a+" is a positive number");
		}
		else
		{
			System.out.print(a+" is a nrgative number");
		}
	}

}
