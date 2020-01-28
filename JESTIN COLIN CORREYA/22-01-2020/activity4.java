package demo;

import java.util.Scanner;

public class activity4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.out.print("enter any number: ");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>0)

{
	System.out.print("it is a positive number");
}
	else if(a<0)
	
		{
		System.out.println("it is a negative number");
		}
	
	else 
	{
		System.out.println("it is zero");
		}
	
}

	}


