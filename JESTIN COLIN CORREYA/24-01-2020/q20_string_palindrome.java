package demo;

import java.util.Scanner;

public class q20_string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string:  ");
		String rev="";
Scanner s=new Scanner(System.in);
String a=s.nextLine();
for(int i=a.length()-1;i>=0;i--)
{
	rev=rev+a.charAt(i);
}
if(rev.equals(a))
{
	System.out.println("it is a palindrome");
}
else
{
	System.out.println("not a palindrome");

}
	}

}
