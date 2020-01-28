package demo_25_01_2020;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a[]=new int[10];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("enter the number to be search");
		int b=scan.nextInt();
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		
		if(count!=0)
		{
			System.out.println(b+" is repeated for "+count+" times");
		}
		else
		{
			System.out.println(b+" is not repeated");
		}
		
	}

}
