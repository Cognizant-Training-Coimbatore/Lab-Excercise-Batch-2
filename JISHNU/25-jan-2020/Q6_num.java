package day4;

import java.util.Scanner;

public class Q6_num {
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter 5 numbers");
		for(int j=0;j<5;j++)
		{
			a[j]=sc.nextInt();
		}
	}
	void calc()
	{
		float sum=0;
		float avg;
		for(int j=0;j<5;j++)
		{
			sum=sum+a[j];
		}
		avg=sum/5;
		System.out.println("Sum = "+sum);
		System.out.println("Avg ="+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6_num obj=new Q6_num();
		obj.get();
		obj.calc();

	}

}
