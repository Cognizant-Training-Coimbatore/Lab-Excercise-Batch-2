package demo;

import java.util.Scanner;

public class ex5_Q5 {
	
	   static void marks()
	   {
		  int num;
		   System.out.println("enter mark");
		   Scanner s=new Scanner(System.in);
		   num=s.nextInt();
		   if(num>0)
		   {
			   System.out.println("The entry is valid");
		   }
		   else
			   throw new ArithmeticException("Invalid mark entered");
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex5_Q5 e=new ex5_Q5();
		e.marks();
	}

}
