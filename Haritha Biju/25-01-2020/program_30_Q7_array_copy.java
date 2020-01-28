package demo;

import java.util.Scanner;

//Declare an array to copy value of one array to other array
public class program_30_Q7_array_copy
{

	public static void main(String[] args)
	{	int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter the values:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Copy of the entered array:");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+b[i]);
			
		}

	}

}
