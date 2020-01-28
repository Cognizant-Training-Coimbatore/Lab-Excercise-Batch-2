package demo;

import java.util.Scanner;

public class ex2_Q3 {

	public static void main(String[] args) {
		int a[]=new int[20],i;
		int largest,smallest;
		double sum=0;
		// TODO Auto-generated method stub
         Scanner S=new Scanner(System.in);
         System.out.println("Enter 10 numbers");
         
         for(i=0;i<10;i++)
         {
        	 a[i]=S.nextInt();
        	 sum=sum+a[i];
        	 
        	
         }
         
         largest=a[0];
         smallest=a[0];
         
         for(i=0;i<10;i++)
         {
        	 if(a[i]>largest)
        	 {
        		 largest=a[i];
        	 }
        	 if(a[i]<smallest)
        	 {
        		 smallest=a[i];
        	 }
        	 
        	 
         }
         
         System.out.println("maximum "+largest);
         System.out.println("minimum "+smallest);
         System.out.println("average "+(sum/10));
         
         
         
	}

}
