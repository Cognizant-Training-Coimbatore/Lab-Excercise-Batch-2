package demo;

import java.util.Scanner;

public class qqq5_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your mark: ");
		int a=s.nextInt();
		
		if((a<0)||a>100)
		
			throw new Exception("invalid number");
		System.out.println("mark="+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
