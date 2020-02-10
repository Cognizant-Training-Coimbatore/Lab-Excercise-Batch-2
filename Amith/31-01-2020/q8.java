package java50programs;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args)
	{
		System.out.println("enter your numbers");
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b>a&&c>b)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
