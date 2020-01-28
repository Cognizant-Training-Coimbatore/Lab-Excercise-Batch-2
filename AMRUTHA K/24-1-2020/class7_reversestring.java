package demo11;

import java.util.Scanner;

public class class7_reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter a string");
		String x=a.nextLine();
		int c=x.length();
		
		for(int i=1;i<=c;i++) {
			System.out.print(x.charAt(c-i));
		}
		

	}

}
