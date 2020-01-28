package demo;

import java.util.Scanner;

public class q11_integer {

	public q11_integer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter two numbers:  ");
Scanner s= new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
if(a<b)
{
	for(int i=a;i<=b;i++)
	{
		System.out.println(i);
}}
else
{
	for(int i=b;i<=a;i++)
	{
		System.out.println(i);
	}
}

	}

}
