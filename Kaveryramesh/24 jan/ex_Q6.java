package demo;

import java.util.Scanner;

public class ex_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		
		System.out.println("Enter numbers");
		Scanner s=new Scanner(System.in);
           int n ;
		   int sum=0;
		   int i=0;
		do {
     
			n=s.nextInt();
	          if(n==-999)
	        	   break;
	        sum=sum+n;
			i=i+1;
			
	}while(n!=-999);
		double avg=(sum)/i;
		System.out.println("sum is "+(sum));
		System.out.println("average is "+avg);
		
	}
}
