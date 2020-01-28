package demo;

import java.util.Scanner;

//input 5 numbers from the user and display the smallest one
public class program_30_Q10_smallest 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n[]=new int[5];
		System.out.println("Enter 5 numbers: ");
		for(int i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
		}
		int min=n[0];
		for(int i=1;i<5;i++)
		{	
			if(n[i]<min)
				min=n[i];
		}
		System.out.println("The smallest number is : "+min);
		}

}
