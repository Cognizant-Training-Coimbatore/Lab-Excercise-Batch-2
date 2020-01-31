//14.	Write a Java program to compute xn % y where x, y and n are all 32bit integers.
package packone;

import java.util.Scanner;

public class p14_31_exp_32bit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number x:");
		int x=sc.nextInt();
		System.out.println("Enter the number y:");
		int y=sc.nextInt();
		System.out.println("Enter the number n:");
		int n=sc.nextInt();
		System.out.println("xn%y= "+(x*n)%y);
		

	}

}
