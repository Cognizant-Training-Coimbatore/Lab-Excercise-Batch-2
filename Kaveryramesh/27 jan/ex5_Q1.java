package demo;

import java.util.Scanner;

public class ex5_Q1 {
  
	   static void positivity()
	   {
		  int num;
		   System.out.println("enter a number");
		   Scanner s=new Scanner(System.in);
		   num=s.nextInt();
		   if(num>0)
		   {
			   System.out.println("The entry is valid");
		   }
		   else
			   throw new ArithmeticException("number is negative");
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex5_Q1 e=new ex5_Q1 ();
		e.positivity();
	}

}
