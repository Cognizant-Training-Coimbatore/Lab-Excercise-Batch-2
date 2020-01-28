package demo;

import java.util.Scanner;

public class qqq4_array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number1");
			int b=s.nextInt();
			int a[]=new int[5];
		try
		{
			
			System.out.println("access element 6:"+a[6]);
			System.out.println(b/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown:"+e);
		}
		
finally
{
	a[0]=b;
	System.out.println(a[0]);
	System.out.println("out of block");
}
	}

}
