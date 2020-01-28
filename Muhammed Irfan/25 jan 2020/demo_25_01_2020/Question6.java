package demo_25_01_2020;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			sum=sum+a[i];
		}
		
		System.out.println("sum = "+sum);
		int avg=sum/a.length;
		System.out.println("avg = "+avg);
	}

}
