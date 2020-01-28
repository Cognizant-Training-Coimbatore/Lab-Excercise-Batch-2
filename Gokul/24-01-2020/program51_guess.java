package gokul;

import java.util.Scanner;

public class program51_guess 
{

	public static void main(String[] args) 
	{
		int a=6;
		System.out.println("Guess the number");
		System.out.println("I'm thinking about a number between 0 and 9 .Can you guess it?(3 attempt(s) left):");
		Scanner sc=new Scanner(System.in);
		int attempt=3;
		while(attempt>=1)
		{
			int guess=sc.nextInt();
			attempt--;
			if(guess!=a && attempt!=0)
			System.out.println("Sorry.Wrong number.I'm thinking about a number between 0 and 9 .Can you guess it?("+attempt+" attempt(s) left):");
			else if(guess==a)
				System.out.println("Hurrah! You have guessed the correct number.");
			else
		System.out.println("Sorry.Wrong number.The correct number is 6");
		
		}
	}

}
