package demo;

import java.util.Scanner;

public class qqq7_custom {

	
		static void validate(int code)throws qqq7_customa
		{
			if ((code<101)||(code>200))
			{
				throw new qqq7_customa("not valid");
			}
				else
				{
					System.out.println("welcome employee");
				}
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	try
	{
	System.out.println("enter employee id:");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
	
		validate(a);
	}
	catch(Exception m)
	{
		System.out.println("exception occured:"+m);
	}
	}

}
