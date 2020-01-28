package demo;

import java.util.Scanner;

public class string_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int len=str.length();
		System.out.println("Length of the string= "+len);
		
	}

}
