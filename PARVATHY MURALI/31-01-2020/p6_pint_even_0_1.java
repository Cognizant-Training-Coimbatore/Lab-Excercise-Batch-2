//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
package packone;

import java.util.Scanner;

public class p6_pint_even_0_1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		float n=sc.nextFloat();
		if(n%2==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}

	}

}
