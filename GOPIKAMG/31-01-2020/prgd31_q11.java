package project1;

import java.util.Scanner;

public class prgd31_q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number");
	       double num=sc.nextInt();
	       double n=num;
	       int c=0;
	       while(num%4==0)
	       {
	    	   num=num/4;
	    	   c++;
	       }
	       if(Math.pow(4,c)==n)
	       {
	    	   System.out.println(n+"is the power of 4");
	       }
	       else
	       {
	    	   System.out.println(n+ "is not the power of 4");
	       }
	}

}
