package demo;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int a=4;
		for(int i=3;i>0;i--)
		{
			
		System.out.println("I'm thinking about a number between 0 and 9.Can you guess it ?( "+ i+"attempt left) ");
		int n=scan.nextInt();
		if(n==a)
		  {
		 	System.out.println("your guess is right");
		 	break;
		  }
		else 
		  {
			System.out.println("wrong");
		  }
		}
		
		
			
		
		
	}

}
