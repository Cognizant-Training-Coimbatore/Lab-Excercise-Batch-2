package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class qstn22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,12,3,4,5,53,0};
		int i,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(a));
		int l=a.length-1;
		for(i=0;i<=l;i++)
			if(i%2==0)
				System.out.print(a[l-i]+"  ");
			else
				System.out.print(a[i]+"  ");

	}

}
