package jan31;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter third number");
		c=sc.nextInt();
		if(a==b && a==c)
		{
			System.out.println("All numbers are equal");
		}
		else if(a==b||b==c||c==a)
		{
			System.out.println("Neither all are equal or different");
				
		}
		else
		{
			System.out.println("All numbers are different");
		}

	}

}
