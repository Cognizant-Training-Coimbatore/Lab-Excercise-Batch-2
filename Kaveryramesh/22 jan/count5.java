package demo;

import java.util.Scanner;

public class count5 {

	public static void main(String[] args) {
		int x,i,count=0;
	     System.out.println("Enter 5 number");
	     
	     for(i=0;i<5;i++)
	     { Scanner s =new Scanner(System.in);
	    
	        x=s.nextInt();
	           if(x%2!=0)
	           {
	        	   count++;
	           }
	           
	     }
	           
	           System.out.println(count);

	}

}
