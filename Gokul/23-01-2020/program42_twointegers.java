package gokul;

import java.util.Scanner;

class display
{
	
	void assign(int a,int b)
	{
	System.out.print("The numbers are ");
	int x=a;
	int y=b;
	for(int i=x+1;i<y;i++)
	{
		System.out.print(i+" ");
	}
	}

}
public class program42_twointegers 
{

	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter second value");
		int b=sc.nextInt();
		System.out.println("Enter the integers");
	    display n=new display();
	    n.assign(a,b);
		
	
	}

}

