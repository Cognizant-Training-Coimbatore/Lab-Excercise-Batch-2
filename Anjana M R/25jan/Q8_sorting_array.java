package PackA;

import java.util.Scanner;

public class Q8_sorting_array {
	void assign()
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		System.out.println("Enter the limit");
		
		int a[]=new int[n];
		
		for (i=0;i<n;i++)
		{ 
			a[i]=sc.nextInt();
		
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
				}
				
			}
			System.out.println(a[i]);
		}
		
	}

}
