/*8.	Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.*/
package packone;

import java.util.Scanner;

public class p8_greater_abc 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Enter third number");
	int c=sc.nextInt();
	boolean state;
	if(a<b && b<c)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("False");
	}

}
}
