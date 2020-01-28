package demo;

import java.util.Scanner;

public class program_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the Radius of the circle\n");
      Scanner scan=new Scanner(System.in);
      int r=scan.nextInt();
      double pi=3.14,a;
      a=pi*r*r;
      System.out.println("\nRadius of the circle is "+a);
	}

}
