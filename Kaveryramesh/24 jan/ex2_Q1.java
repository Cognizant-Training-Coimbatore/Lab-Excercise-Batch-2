package demo;

import java.util.Scanner;

public class ex2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter 1st number");
		  int b=s.nextInt();
		  System.out.println("enter 2nd number");
		  int c=s.nextInt();
		  for(i=b+1;i<c;i++)
		  {
			  System.out.println(i);
		  }

	}

}
