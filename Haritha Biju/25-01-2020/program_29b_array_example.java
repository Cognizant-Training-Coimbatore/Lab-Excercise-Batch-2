package demo;

import java.util.Scanner;

public class program_29b_array_example 
{

	public static void main(String[] args)
	{ 
		
		Scanner sc=new Scanner(System.in);
		int l;
		System.out.println("Enter the total number of numbers");
		l=sc.nextInt();
		int n[]=new int[l];
		int sum=0;
		double avg;
		
		System.out.println("Enter "+l+" numbers: ");
		for(int i=0;i<l;i++)
		{
			n[i]=sc.nextInt();
			sum+=n[i];
		}
		avg=(sum/(double)l);
		int min=n[0];
		int max=n[0];
		for(int i=1;i<l;i++)
		{	
			if(n[i]<min)
				min=n[i];
			
			if(n[i]>max)
				max=n[i];
			
		}
		System.out.println("The smallest number is : "+min);
		System.out.println("The largest number is : "+max);
		System.out.println("The average of the "+l+" numbers is : "+avg);

	}

}

