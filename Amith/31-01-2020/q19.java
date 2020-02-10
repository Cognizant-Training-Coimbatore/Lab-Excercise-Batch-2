package java50programs;

import java.util.Scanner;

public class q19 {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the element you want to search");
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]==num);
			{
				count++;
			}
					
		}
		if(count==1)
		{
			System.out.println("number found");
		}
		else
		{
			System.out.println("number not found");
		}
	}

}
