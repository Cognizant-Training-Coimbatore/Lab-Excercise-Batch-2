package demo;

import java.util.Scanner;

public class Question7_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size for the array");
		n=sc.nextInt();
		System.out.println("enter the values for 1st array");
		for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		//copying of values
		for(i=0;i<n;i++)
		{
			arr2[i]=arr1[i];
			
		}
		//printing values
		for(i=0;i<n;i++)
		{
			System.out.println(arr2[i]);
			
		}

	}

}
