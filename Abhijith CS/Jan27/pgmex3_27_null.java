package exceptionhandling;

import java.util.Scanner;

public class pgmex3_27_null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String str=null;
			System.out.println("Entered string length is : "+str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception caught...");
		}
		
	}

}
