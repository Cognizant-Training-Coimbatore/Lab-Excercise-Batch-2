package demo;

import java.util.Scanner;

class calculator
{
	int a,b;
	
	void add(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
		
	}
	void sub(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a-b);
		
	}
	void mul(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a*b);
		
	}
	void div(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a/b);
		
	}
	

}

public class Q4 {

	public static void main(String[] args) {
		int l,b;
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        l=s.nextInt();
        System.out.println("enter next number");
        b=s.nextInt();
		calculator c= new calculator();
		c.add(l,b);
		c.sub(l,b);
		c.mul(l,b);
		c.div(l,b);

	}

}
