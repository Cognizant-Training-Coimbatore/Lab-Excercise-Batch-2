package demo;

import java.util.Scanner;

public class program24_arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("enter maximum size:");
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int number[]=new int [l];
		
System.out.println("enter number:");
int n=s.nextInt();
int g=n;
for(int i=1;i<l;i++)
{
	System.out.println("enter numbers"+i);
	 n=s.nextInt();
	number[i]=n;
	if(n>g)
	{
		g=n;
	}
}
System.out.print("numbers are:");
for(int i=0;i<n;i++)
{
	System.out.print(number[i]);
	
}
System.out.println("greatest number"+g);
	
	}
	
	
	

	}



