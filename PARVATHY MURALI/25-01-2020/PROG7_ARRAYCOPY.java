package DemoTwo;

import java.util.Scanner;

public class PROG7_ARRAYCOPY 
{

	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	System.out.println("Enter the numbers: ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.print("Real array=");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]);
	}

	
	int a_copy[]=new int[n+1];
	for(int i=0;i<n;i++)
	{
		a_copy[i]=a[i];
	}
	System.out.print("\nDuplicate array=");
	for(int i=0;i<n;i++)
	{
		System.out.print(a_copy[i]);
	}

	}

}
