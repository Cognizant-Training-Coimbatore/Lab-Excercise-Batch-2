package demo;

import java.util.Scanner;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,d;
		while(a>0)
		{
			d=a%10;
			sum=sum+d;
			a=a/10;
		}
		System.out.println("Sum of digits= "+sum);
	}

}
