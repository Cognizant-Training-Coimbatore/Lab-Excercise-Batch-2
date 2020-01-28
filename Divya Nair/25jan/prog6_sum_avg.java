package DemoTwo;

import java.util.Scanner;

public class prog6_sum_avg 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("SUM: "+sum);
		System.out.println("AVG: "+sum/n);
	}

}
