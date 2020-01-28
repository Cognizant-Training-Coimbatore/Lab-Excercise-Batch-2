package day4;

import java.util.Scanner;

public class Q8_sort {
	int a[]=new int[5];
	
	int dsc[]=new int[5];
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
	}
	void sorting()
	{
		int c;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i]<a[j])
				{	
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		for(int j=0;j<5;j++)
		{
			dsc[j]=a[4-j];
		}
		System.out.println("Ascending order");
		for(int j=0;j<5;j++)
			System.out.print(a[j]+" ");
		System.out.println("\nDescending order");
		for(int j=0;j<5;j++)
			System.out.print(dsc[j]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8_sort obj=new Q8_sort();
		obj.get();
		obj.sorting();

	}

}
