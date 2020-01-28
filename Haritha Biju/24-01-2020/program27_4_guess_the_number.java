package demo;

import java.util.Scanner;

/*Write and test a java program that picks a number between 0 and 9 and
 *  gives the user 3 chances to guess it. If the user doesn’t guess the 
 *  number correctly in 3 attempts then the program should display the chosen
 *   number and exit. (integers only). 
 */
public class program27_4_guess_the_number 
{
	public static void main(String[] args)
	{
		int number,guess;
		int range=9;
		Scanner sc=new Scanner(System.in);
		number=(int)(Math.random()*range);
		System.out.println("Guess the number :");
		for(int i=0;i<3;i++)
		{
			guess=sc.nextInt();
			if(guess==number)
			{	
				System.out.println("You Win, The number is : "+number);
				System.exit(0);
			}
			else
			{
				System.out.println(" Incorrect. You have "+(2-i)+" attemp(s) left");
			}
		
		}
		System.out.println("\n You Lost. The correct answer is : "+number);
		
	}

}
