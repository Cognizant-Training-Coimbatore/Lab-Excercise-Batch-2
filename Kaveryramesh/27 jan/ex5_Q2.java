package demo;

import java.util.Scanner;

public class ex5_Q2 {
	
	
	
	public static void main(String[] args) {
		
		int num,num1;
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number");
		 Scanner s=new Scanner(System.in);
		   num=s.nextInt();
		   
		   System.out.println("Enter 2nd number");
		   num1=s.nextInt();
		   try
		   {
			   int result ;
			   result=num/num1;
			   System.out.println(result);
		   }
			
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception occurs");
			}
	}

}
