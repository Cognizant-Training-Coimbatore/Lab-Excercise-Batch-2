package javatest;

import java.util.Scanner;

public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n,reverse="";
		int l, i=0,j;
		System.out.print("Enter String	->	");
		n=s.nextLine();


		j=n.length()-1;
		for(i=0;i<n.length();i++,j--)
		{
		reverse=reverse+n.charAt(j);
		}
		System.out.print("reverse string	->	"+reverse);


	}

}
