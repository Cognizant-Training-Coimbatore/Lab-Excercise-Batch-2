package gokul;

import java.util.Scanner;

class programming
{
	 programming()
	{
		System.out.println("I love programming languages");
	}
	 programming(String s)
	{
		String name=s;
		System.out.println("I love "+name);
		
	}
}

public class program38_Programming {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a programming language");
		String n=sc.next();
		programming p=new programming();
		programming p1=new programming(n);
		

	}

}
