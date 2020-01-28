package classworkA;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) 
	{
		int sum=0;
		int avg;
		Scanner sc=new Scanner(System.in);
		
		int number[]=new int[5];
		System.out.println("Enter 5 numbers: ");
		for(int i=0;i<5;i++)
			{
			number[i]=sc.nextInt();
			sum=sum+number[i];
			
			}
		avg=sum/5;
		System.out.println("Sum:"+sum+" "+"Average:"+avg);
		}

	}


