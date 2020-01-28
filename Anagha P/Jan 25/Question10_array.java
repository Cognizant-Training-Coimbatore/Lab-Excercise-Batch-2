package demo;

import java.util.Scanner;

public class Question10_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int i,smallest,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size for the array");
		n=sc.nextInt();
		System.out.println("enter the 0 th value");
		arr[0]=sc.nextInt();
		smallest=arr[0];
		System.out.println("enter the remaining values for  array");
		for(i=1;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			
		}
		System.out.println("samallest is:"+smallest);

	}

}
