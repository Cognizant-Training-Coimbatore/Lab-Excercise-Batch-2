package demo3;

import java.util.Scanner;

public class ques3 
{

	public static void main(String[] args)
	{	
		
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int n = s.length();
		try
		{
			if(n!=0)
			{
				System.out.println("Length : "+n);
			}
			else
			{
				throw  new NullPointerException("ERROR");
			}
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Thrown : "+e);
		}

	}

}
