package demo;

import java.util.Scanner;

class integer
{
	//int n;
	void display(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			System.out.println(i);
		}
	}
}

public class program49_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		integer o=new integer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		num1=sc.nextInt();
		System.out.println("enter second no");
		num2=sc.nextInt();
		o.display(num1,num2);
		

	}

}
