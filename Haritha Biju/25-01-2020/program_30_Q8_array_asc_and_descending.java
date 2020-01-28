package demo;
//Input 5 numbers from the user and store in the array.
//Sort in ascending and descending order

import java.util.Scanner;

public class program_30_Q8_array_asc_and_descending
{

	public static void main(String[] args) 
	{	int i,j,temp;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(j=1;j<5;j++)
		{
			for(i=0;i<5-j;i++)
			{	if(a[i]>a[i+1])
				{
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print("\n The array in ascending order: ");
		for(i=0;i<5;i++)
		{ 
			System.out.print(a[i]+" ");
		}
		for(j=1;j<5;j++)
		{
			for(i=0;i<5-j;i++)
			{	if(a[i]<a[i+1])
				{
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print("\n The array in descending order: ");
		for(i=0;i<5;i++)
		{ 
			System.out.print(a[i]+" ");
		}
	}

}
