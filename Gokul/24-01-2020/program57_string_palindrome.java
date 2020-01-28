package gokul;

import java.util.Scanner;

public class program57_string_palindrome {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word");
String s=sc.next();
String palin="";

for(int i=s.length()-1;i>=0;i--)
{
	palin=palin+s.charAt(i);
	
	
}

if(s.equals(palin))
{
	System.out.println("The word is palindrome");
	
}
else
{
	System.out.println("Not a palindrome");
}
	}

}
