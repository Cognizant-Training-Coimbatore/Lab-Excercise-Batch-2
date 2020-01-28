package packA;

import java.util.Scanner;

public class prog8_asc_dasc 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int sum=0;
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
			System.out.print("Ascending order=");
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j]);
			}
			
		

	}

}
