package javatest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class qstn20 {

	public static void main(String[] args) {

		int a[]= {1,12,3,4,5,53};
		int pos=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("\nenter deleting element");
		int b=sc.nextInt();
		for(i=0;i<a.length;i++)
			if(a[i]==b)
				pos=1;
		for(i=pos;i<a.length-1;i++)
			a[i]=a[i+1];
		a[i]=0;
		System.out.println(Arrays.toString(a));
		
	}

}
