package demo;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the inputs");
		int n=0,sum=0;
		int count=0;
		while( n!=999)
		
		{
			 n=scan.nextInt();
			if(n!=999)
			{
				sum=sum+n;
				count++;
			}
			
			
		}
		int avg=sum/count;
		System.out.println("sum = "+sum+"\navg = "+avg);
	}
	
}
