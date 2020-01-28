package demo;

import java.util.Scanner;

public class Program_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.print("Enter the number");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.print(a+" is an even number");
		}
		else
		{
			System.out.print(a+" is an odd number");
		}
	}

}
