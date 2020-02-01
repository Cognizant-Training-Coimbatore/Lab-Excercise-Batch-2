package Project;

import java.util.Scanner;

public class pgm31_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		int j=0;
		String rev="";
		for( int i = s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
