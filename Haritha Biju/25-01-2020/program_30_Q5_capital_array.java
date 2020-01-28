package demo;

import java.util.Scanner;

/*5Declare an array to store your 5 friend names
 *  and display in capital letters
 */

public class program_30_Q5_capital_array 
{
	public static void main(String[] args)
	{ 
		String friends[]=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter names of friend "+(i+1));
			friends[i]=sc.next();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Friend "+(i+1)+" : "+friends[i].toUpperCase());
			
		}
		
	}

}
