package packone;

import java.util.Scanner;

public class p26_31_smallest
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int s, a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		s=a[0];
		for(int i=1;i<n;i++)
		{
			if(s>a[i])
			{
				s=a[i];
			}
		}
		System.out.println("Smallest element= "+s);
		
		
		
	}

}
