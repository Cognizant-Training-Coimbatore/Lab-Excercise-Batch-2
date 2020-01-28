package day3;

import java.util.Random;
import java.util.Scanner;

class number
{
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	int a,b,c,i=3;
	void ran()
	{
	 a=ran.nextInt(10);
	}
	void ask()
	{
		if(i!=0)
		{
		System.out.println("I am thinking about a number between 0 and 9. Can you guess it? ("+i+"attempt(s)left)");
		System.out.println("Enter the number");
		b=sc.nextInt();
		
			if(b==a)
			{
			System.out.println("Correct answer");
			i=-1;
			}
			else
			{
			i--;
			System.out.println("Sorry. Wrong number");
			}
		}
		else
		{
			System.out.println("The correct answer is "+a);
			i=-1;
		}
	}
	
}
public class Q4_random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number obj=new number();
		obj.ran();
		while(obj.i!=-1)
		obj.ask();
	}

}
