package gokul;

import java.util.Scanner;

class multiple
{
	void display(int a)
	{
		int x=a;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print((i*j)+" ");
			}
			System.out.println();
				
		}
		
	}
}
public class program49_multiplicationtable {

	public static void main(String[] args)  
	{
		System.out.println("Enter a number between 1 and 9");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		multiple obj=new multiple();
		if(x>=1 && x<=9)
		{
		obj.display(x);
		}
		else
			System.out.println("Please enter a valid number");
	}

}

