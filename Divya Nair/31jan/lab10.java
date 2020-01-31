package project1;

import java.util.Scanner;

public class lab10 {

	public static void main(String[] args) 
	{
		int num1,num2,res=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the first array:");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the size of the second array:");
		int m=in.nextInt();
		int[] ar=new int[m];
		System.out.println("Enter the values of the first array:");
		
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the values of the second array:");
		for(int i=0;i<m;i++)
		{
			ar[i]=in.nextInt();
		}
		System.out.println("muliplied values are:");
		for(int j=0;j<n;j++)
		{
			
			res=a[j]*ar[j];

			System.out.println(+res);
		}
		
		
		
		

	}

}
