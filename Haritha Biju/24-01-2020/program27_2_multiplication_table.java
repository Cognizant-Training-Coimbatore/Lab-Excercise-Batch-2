package demo;

import java.util.Scanner;

/*Write a Java program that asks the user to input a positive integer N 
 * between 1 and 9 then prints the multiplication table up to N. 
 */
public class program27_2_multiplication_table
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a postive integer");
		n=sc.nextInt();
		if(n<=0)
			System.out.println("You have entered a negative integer or zero. Enter a postive integer");
		else
		{	
			for(int i=1;i<=n;i++)
			{	System.out.println("The multiplication table of "+i+" is:");
				for(int j=1;j<=10;j++)
				{
					System.out.println(j+" * "+i+" = "+j*i);
				}
			}
		}
		
	}

}
