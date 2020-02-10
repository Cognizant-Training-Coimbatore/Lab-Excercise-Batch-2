package java50programs;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) 
	{
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first array");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the second array");
		for(int i=0;i<10;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			c[i]=a[i]*b[i];
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(c[i]);
		}

	}

}
