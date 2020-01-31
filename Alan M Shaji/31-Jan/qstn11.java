package javatest;

import java.util.Scanner;

public class qstn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number\t:\t");
		int a=sc.nextInt();
		if(a==0)
			System.out.println("Not Power of 4");
		else
		{
			while(a!=1)
			{
				if(a%4!=0)
				{
					System.out.println("Not power of 4");
					return;
				}
				a=a/4;
			}
			System.out.println("power of 4");
		}

	}

}
