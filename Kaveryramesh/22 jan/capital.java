package demo;

import java.util.Scanner;

public class capital {

	public static void main(String[] args) {
		System.out.println("Enter name");
		Scanner s=new Scanner(System.in);
		 String name=s.nextLine();
		 
		 System.out.println(name.toUpperCase());
         System.out.println(name.length());
	}

}
