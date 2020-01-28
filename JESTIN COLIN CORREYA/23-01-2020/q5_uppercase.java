package demo;

import java.util.Scanner;

class stringhandler
{
	String a;
	void num()
	{
		System.out.println("number of characters:"+a.length());
	}
	void upper()
	{
		System.out.println(a.toUpperCase());
	}
	void lower()
	{
		System.out.println(a.toLowerCase());
	}
}
public class q5_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter any string:");
Scanner s = new Scanner(System.in);


stringhandler obj=new stringhandler();
obj.a= s.nextLine();
obj.num();

obj.upper();
obj.lower();



	}

}
