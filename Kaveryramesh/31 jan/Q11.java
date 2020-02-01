package practical_excercise;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c=0;
		  Scanner s=new Scanner(System.in);
         System.out.println("enter a num");
               int n=s.nextInt();
               double num=n;
               while(n%4==0)
               {   n=n/4;
                     c=c+1;
               }
               if((Math.pow(4, c))==num)
            	    System.out.println("yes its a power");
               else
            	   System.out.println("not a perfect power of 4");
                         
	                            }

}
