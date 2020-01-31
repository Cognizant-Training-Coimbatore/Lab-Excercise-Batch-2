package javatest;

import java.util.Scanner;

public class qstn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=2,i,j;
		int count=1;
		for(i=3;count<100;i++)
		{
		int flag=0;
		for(j=2;j<=i/2;j++)
			{
			if(i%j==0)
				flag=1;
			}
			if(flag==0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println(sum);
	}
}
