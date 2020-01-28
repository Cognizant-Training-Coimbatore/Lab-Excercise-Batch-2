package demo;

import java.util.Scanner;

public class ex5_Q7 {

	static void checkvalidity(int n)
	{
		if(n>=101 && n<=200)
		{
			System.out.println("Employee code is valid");
		}
		else
		{
			throw new ArithmeticException("employee code is rejected");
		}
	}
	
	public static void main(String[] args) {
		int num;
		   System.out.println("enter mark");
		   Scanner s=new Scanner(System.in);
		   num=s.nextInt();
		   checkvalidity(num);
		// TODO Auto-generated method stub

	}

}
