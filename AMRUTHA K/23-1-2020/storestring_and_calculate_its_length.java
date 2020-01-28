package demo;

import java.util.Scanner;

public class storestring_and_calculate_its_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my name:");
		Scanner a=new Scanner(System.in);
		String b=a.nextLine();
		String c=b.toUpperCase();
		int len=b.length();
		System.out.println(c);
		System.out.println("length="+len);
		

	}

}
