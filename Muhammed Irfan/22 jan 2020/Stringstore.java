package demo;

import java.util.Scanner;

public class Stringstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("Enteryour name");
		Scanner scan=new Scanner (System.in);
		String a=scan.nextLine();
		System.out.println(a.toUpperCase());
		System.out.println("Length = "+a.length());
	}

}
