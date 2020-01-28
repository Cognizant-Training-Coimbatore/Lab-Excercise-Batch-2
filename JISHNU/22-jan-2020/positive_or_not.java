package demo;

import java.util.Scanner;

public class positive_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		if(i==0)
		{
			System.out.println("Zero is neither positive nor negative");
		}
		else
		{
			if(i>0)
				System.out.println("positive number");
			else
				System.out.println("negative number");
		}
	}

}
