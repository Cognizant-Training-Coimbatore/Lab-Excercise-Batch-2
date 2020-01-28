package demo_25_01_2020;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		int small=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			
				if(a[i]>a[i+1])
				{
					small=a[i+1];
				}
		}
		System.out.println("smallest number is "+small);
		
	}

}
