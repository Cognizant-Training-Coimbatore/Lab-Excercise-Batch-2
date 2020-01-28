package demo;

import java.util.Scanner;


public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the 10 numbers");
		Scanner scan=new Scanner(System.in);
		int sum=0,max=0,min=0;
		for(int i=1;i<=10;i++)
		{
			int a=scan.nextInt();
			
		    sum=sum+a;
		    if(i==1)
		    {
		    	min=a;
		    }
		    if(a>max)
		    {
		    	max=a;	    	
		    }
		    else if(a<min)
		    {
		    	min=a;
		    }
		    	    	
		}
		
		
		System.out.println("max = "+max);
		double avg=sum/10;
		System.out.println("min = "+min);
		System.out.println("sum1" = "+sum);
		System.out.println("Average = "+avg);
		
	}

}
