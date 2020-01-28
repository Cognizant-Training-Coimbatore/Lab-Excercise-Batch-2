package demo;

import java.util.Scanner;

class programming
{
	String s;
	programming()
	{
		System.out.println("i love programming");
	}
	programming(String s)
	{
		System.out.println("i love "+s);
	}
}
public class q8_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
programming obj=new programming();
System.out.print("enter your string:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
programming obj1=new programming(a);


	}

}
