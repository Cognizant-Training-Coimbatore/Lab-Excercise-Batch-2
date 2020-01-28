package demo;

import java.util.Scanner;

public class divisible_by_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		
			if(a%7==0)
			{
				System.out.println("Divisible by 7");
			}
			else
			{
				System.out.println("Not divisible by 7");
			}
			
	}

}
