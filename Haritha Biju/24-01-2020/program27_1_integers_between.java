package demo;

import java.util.Scanner;

/*Write a Java program that asks the user to input two 
 * integers and lists all integers between the two in proper order. 
 */
public class program27_1_integers_between 
{
	public static void main(String[] args)
	{
		int first,last;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the first number ");
		first=sc.nextInt();
		System.out.println(" Enter the last number ");
		last=sc.nextInt();
		if(first>last)
		{
			int temp=last;
			last=first;
			first=temp;
		}
		if(first+1<last)
		{
			System.out.println("The integers between "+first+" and "+last+" are(is) ");
			for(int i=(first+1);i<last;i++)
				System.out.print(i+" ");
		}
		else
			System.out.println("There are no integers between "+first+" and "+last);
	}

}
