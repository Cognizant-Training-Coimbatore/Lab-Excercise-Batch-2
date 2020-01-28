package demo;
//Write a program to declare an array to store 10 values.
//Using sequential search, verify an element is present or not

import java.util.Scanner;

public class program_30_Q9_array_sequential_search 
{
	public static void main(String[] args)
	{	int i,n,flag=0;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers :");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the search element");
		n=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(a[i]==n)
				flag=1;
		}
		if(flag==1)
			System.out.println("Element is present in the array");
		else
			System.out.println("Element is not present in the array");
		

	}

}
