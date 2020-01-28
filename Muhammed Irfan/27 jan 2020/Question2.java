package monday;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try
	{
		Scanner scan=new Scanner(System.in);
		int a,b;
		System.out.println("enter a number");
		a=scan.nextInt();
		System.out.println("enter a number");
		b=scan.nextInt();
		
		
		int result;
		result=a/b;
		System.out.println("Result : "+result);
	}
	
	catch(Throwable e)
	{
		System.out.println("error encountered  "+e);
	}
 }

}
