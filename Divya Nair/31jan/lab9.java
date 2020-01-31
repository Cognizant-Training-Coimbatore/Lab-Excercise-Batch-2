package project1;

import java.util.Scanner;

public class lab9 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the end limit:");
		
		
		int b=in.nextInt();
		for(int i=1;i<=b;i++)
		{
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					sum=sum+i;
				}
			}
		}
		System.out.println(sum);
	}

}
