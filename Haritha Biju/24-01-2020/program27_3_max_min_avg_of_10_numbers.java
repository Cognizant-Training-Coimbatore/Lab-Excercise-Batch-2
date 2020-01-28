package demo;

import java.util.Scanner;

/*Write a Java program that reads 10 integers then displays the 
 * maximum, minimum and average numbers. 
 */
public class program27_3_max_min_avg_of_10_numbers 
{

	public static void main(String[] args)
	{
		int n[]=new int[10];
		int sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		for(int i=0;i<10;i++)
		{
			n[i]=sc.nextInt();
			sum+=n[i];
			
		}
		avg=(sum/10.0);
		int min=n[0];
		int max=n[0];
		for(int i=1;i<10;i++)
		{	
			if(n[i]<min)
				min=n[i];
			
			if(n[i]>max)
				max=n[i];
			
		}
		System.out.println("The smallest number is : "+min);
		System.out.println("The largest number is : "+max);
		System.out.println("The average of the 10 numbers is : "+avg);

	}

}
