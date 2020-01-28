package demo;

import java.util.Scanner;

public class activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		
		System.out.print("enter 5 integer numbers:  ");

		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		int a=s.nextInt();
		if(a%2!=0)
			c++;
		}
		
		System.out.println("odd number count:"+c);

	}

}
