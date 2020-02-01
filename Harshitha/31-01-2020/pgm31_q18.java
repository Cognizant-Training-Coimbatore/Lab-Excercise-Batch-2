package Project;

import java.util.Scanner;

public class pgm31_q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 3 numbers");
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   int n3=sc.nextInt();
   if((n1==n2)&&(n2==n3))
   	   System.out.println("All numbers are equal");
   else if((n1!=n2)&&(n1!=n3)&&(n2!=n3))
	   System.out.println("All numbers are different");
   else
	   System.out.println("Neither all are equal or different");
	   
   }
	}


