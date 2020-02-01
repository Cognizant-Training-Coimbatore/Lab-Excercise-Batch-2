package project1;

import java.util.Scanner;

public class prgd31_q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the first number");
	       int n1=sc.nextInt();
	       System.out.println("Enter the second number");
	       int n2=sc.nextInt();
	       System.out.println("Enter the third number");
	       int n3=sc.nextInt();
	       if(n1==n2 && n1==n3)
	       {
	    	   System.out.println("All numbers are equal");
	       }
	       else if((n1==n2) ||(n1==n3)||(n2==n3))
	    		   {
	    	   System.out.println("Neither all are equal or different otherwise");
	    		   }
	       else
	       {
	    	   System.out.println("All are different");
	       }
	}

}
