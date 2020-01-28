package classworkA;

import java.util.Scanner;

public class question8_sort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int temp;
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<4;i++) //sort ascending
			for(int j=0;j<4;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
			
		
		System.out.print("The array in ascending order is ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
			
		}
			for(int i=0;i<4;i++) //sort descending
			
		{
			for(int j=0;j<4;j++)
		{
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
			
		}
			System.out.println(" ");
			System.out.print("The array in descending order is ");
			for(int i=0;i<5;i++)
			{
				System.out.print(a[i]+" ");
				
			}
	}

}

