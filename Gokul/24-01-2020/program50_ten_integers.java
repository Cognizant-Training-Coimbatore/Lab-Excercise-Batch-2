package gokul;

import java.util.Scanner;



public class program50_ten_integers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 numbers");
		
		
		int x[];
		x=new int[10];
		
			
		for(int i=1;i<10;i++)
		{
			x[i]=sc.nextInt();
			
		}
		double avg;
		int max=0;
		int min=x[1];
		int sum=0;
		for(int i=1;i<10;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
				
			}
			
			if(x[i]<min)
			{
				min=x[i];
				
			}
			
			sum=sum+x[i];
		}
		avg=sum/10;
		System.out.println("The max is :"+max);
		System.out.println("The min is :"+min);
		System.out.println("The average is :"+avg);
			
	}

}
