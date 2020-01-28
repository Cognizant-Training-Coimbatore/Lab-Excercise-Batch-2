package classworkA;

import java.util.Scanner;

public class question10_smallestnumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n[]=new int[5];
		System.out.println("Enter 5 numbers ");
		for(int i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
			
		}
		int small=n[0];
		for(int i=1;i<5;i++)
		{
			if(n[i]<small)
			{
				small=n[i];
			}
		}
		System.out.println("Smallest number is :"+small);

	}

}
