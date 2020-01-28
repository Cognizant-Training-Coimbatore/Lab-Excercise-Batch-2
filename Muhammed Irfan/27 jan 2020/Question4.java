package monday;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
 {
	Scanner scan=new Scanner(System.in);
	int a,b;
	int ar[]=new int[5];
	System.out.println("enter a number");
	a=scan.nextInt();	
	System.out.println("enter another number");
	b=scan.nextInt();	
	int result;
	result=a/b;
	System.out.println("Result : "+result);
	ar[5]=result;
	
 } 
	catch(ArithmeticException e)	
    {
		System.out.println("error encounter...."+e);
		}
catch(ArrayIndexOutOfBoundsException e)	
{
	System.out.println("error encounter...."+e);
	}
	}

}
