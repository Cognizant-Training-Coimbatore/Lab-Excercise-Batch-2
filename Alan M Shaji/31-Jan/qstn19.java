package javatest;

import java.util.Scanner;

public class qstn19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,12,3,4,5,53};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search element");
		int b=sc.nextInt();
		int f=0;
		for(int i=0;i<6;i++)
			if(a[i]==b)
			{
				f=1;
				System.out.println("element found at pos "+i);
				break;
			}
		if(f==0)
			System.out.println("element not found");
		
	}

}
