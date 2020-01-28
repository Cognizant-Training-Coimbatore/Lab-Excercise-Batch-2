package demo;

import java.util.Scanner;

public class q17_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		System.out.println("enter string:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();

for(int i=a.length()-1;i>=0;i--)
{
	rev=rev+a.charAt(i);
}
System.out.println(rev);
	}

}
