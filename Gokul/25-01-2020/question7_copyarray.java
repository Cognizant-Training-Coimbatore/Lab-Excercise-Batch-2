package classworkA;

import java.util.Scanner;

public class question7_copyarray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter the values");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
			
		}
		System.out.print("Elements of array a ");
		for(int i=0;i<5;i++)	
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		System.out.print("Elements of array b ");
		for(int i=0;i<5;i++)	
		{
			System.out.print(b[i]+" ");
		}
	}

}

