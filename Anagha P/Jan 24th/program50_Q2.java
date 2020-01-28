package demo;

import java.util.Scanner;

public class program50_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}

}
