package demo;

import java.util.Scanner;

class cal
{
	int add(int a, int b)
	{
		return a+b;
		
	}
	int sub(int a,int b)
	{
		if(a>b)
		{
			return a-b;
		}
		else 
		{
			return b-a;
		}
	}
	int mul(int a, int b)
	{
		return a*b;
		
	}
	int div(int a, int b)
	{
		return(a/b);
	}
}
public class q4_calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter num1:");
Scanner s= new Scanner(System.in);
int num1=s.nextInt();
System.out.println("enter num2:");
int num2= s.nextInt();
cal obj=new cal();
System.out.println("addition:"+obj.add(num1,num2));
System.out.println("subtraction:"+obj.sub(num1,num2));
System.out.println("multiplication:"+obj.mul(num1,num2));
System.out.println("division:"+obj.div(num1,num2));
	}

}
