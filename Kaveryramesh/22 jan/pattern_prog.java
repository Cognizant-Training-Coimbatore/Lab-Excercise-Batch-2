package demo;

import java.util.Scanner;

public class pattern_prog {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	   double sum=0,i;
	   double avg;
		System.out.println("enter 5 numbers");
		     for(i=0;i<5;i++)
		     {
		    	 sum= sum+ s.nextInt();
		     }
		     System.out.println("sum is "+sum);
		     avg=sum/5;
		     System.out.println("Avg is"+avg);
		     

	}

}
