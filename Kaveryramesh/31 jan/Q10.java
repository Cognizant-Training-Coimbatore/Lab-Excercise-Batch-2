package practical_excercise;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
	      
	          Scanner s=new Scanner(System.in);
                    int a[]=new int[20];
                    int b[]=new int[20];
                    System.out.println("enter the elements of 1st array");
                       for(i=0;i<5;i++)
                    	    a[i]=s.nextInt();
                       System.out.println("enter the elements of 2nd array");
                       for(i=0;i<5;i++)
                       {  b[i]=s.nextInt();   
                          b[i]=b[i]*a[i];
                       }
                       for(i=0;i<5;i++)
                       System.out.println(b[i]);
	}

}
