package demo;

import java.util.Scanner;

public class Question6_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int s=0,i;
		float avg;
		
		System.out.println("enter the no:");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			s=s+arr[i];
		}
		avg=s/5;
		System.out.println("sum"+s);
		System.out.println("average"+avg);

	}

}