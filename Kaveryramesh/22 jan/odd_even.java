package demo;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		int x;
		System.out.println("enter number");
         Scanner s=new Scanner(System.in);
            x=s.nextInt();
            if(x%2==0)
            {
            	System.out.println("even");
            }
            else
            	System.out.println("odd");
	}

}
