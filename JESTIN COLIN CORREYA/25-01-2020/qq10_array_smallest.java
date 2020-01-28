package demo;

import java.util.Scanner;

public class qq10_array_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int[5];

System.out.println("enter number:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sm=n;
for(int i=1;i<5;i++)
{
	System.out.println("enter numbers"+i);
	 n=s.nextInt();
	array[i]=n;
	if(n<sm)
	{
		sm=n;
	}
}
System.out.print("numbers are: ");
for(int i=0;i<5;i++)
{
	System.out.print(array[i]+",");
	
}
System.out.println("smallest number="+sm);
	
	}
	}

