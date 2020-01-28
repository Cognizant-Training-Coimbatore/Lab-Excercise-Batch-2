package Package2;

import java.util.Scanner;

public class program56_set2_q4 {

	public static void main(String[] args) {
		int num=7,input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Im thinking abt a no. between 0 and 9.Can you guess it?");
		input=sc.nextInt();
		if(input==num)
		{
			System.out.println("Guessed it right!!!");
		}
		else
		{
			System.out.println("Sorry! Guess another one. Two chances left..");
			input=sc.nextInt();
			if(input==num)
			{
				System.out.println("Guessed it right!!!");
			}
			else
			{
				System.out.println("Sorry! Guess another one. One chance left..");
				input=sc.nextInt();
				if(input==num)
				{
					System.out.println("Guessed it right!!!");
				}
				else
				{
					System.out.println("Sorry you loose :(");
				}
			}
				
			
			
		}
		
	}

}
