package demo;

import java.util.Scanner;

public class qq9_array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int[10];
System.out.println("enter 10 numbers: ");
Scanner s=new Scanner(System.in);
for(int i=0;i<10;i++)
{
	array[i]=s.nextInt();
		
}
System.out.println("enter search element");
int b=s.nextInt();
for(int i=0;i<10;i++)
{
	if(array[i]==b)
	{
		System.out.println("the element is present");
		return;
	}
}
	
	
		System.out.println("the element is absent");
	
}
	}


