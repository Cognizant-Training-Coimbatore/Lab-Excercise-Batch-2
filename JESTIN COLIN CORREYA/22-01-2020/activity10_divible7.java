package demo;

import java.util.Scanner;

public class activity10_divible7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any number:  "); 
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%7==0)
		{
			System.out.println("the number is divisible by 7:  ");
		}
		else
			System.out.println("not divisible by 7");
	}

}
