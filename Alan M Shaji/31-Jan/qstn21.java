package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class qstn21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,12,3,4,5,53,0};
		int i,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("\nenter position at which element is to be inserted");
		int pos=sc.nextInt();
		System.out.println("\nenter element is to be inserted");
		int b=sc.nextInt();
		temp=a[a.length-1];
		for(i=a.length-1;i>pos;i--)
			{
			a[i]=a[i-1];
			}
		a[pos]=b;
		System.out.println(Arrays.toString(a));
		
	}

}
