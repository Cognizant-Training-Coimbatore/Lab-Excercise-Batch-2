package demo;

import java.util.Scanner;

public class q18_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=0;
		System.out.println("enter string:");
Scanner s=new Scanner(System.in);
String a=s.next();

for(int i=0;i<a.length();i++)
{
	if((a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u'))
	{
		v++;	
	}
}
System.out.println("vowels="+v);
	}

}
