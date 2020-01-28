package day3;

import java.util.Scanner;

class integer
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	void call()
	{	
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			c=a;
			a=b;
			b=c;
		}
	}
	void display()
	{
		for(int i=a+1;i<b;i++)
			System.out.println(i);
	}
}
public class Q1_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		integer obj=new integer();
		obj.call();
		obj.display();
	}

}
