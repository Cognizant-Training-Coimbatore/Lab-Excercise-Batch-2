package demo;

import java.util.Scanner;

class addamount
{
	int amount=50;
	addamount()
	{
		System.out.println("total amount :"+amount);
	}
	addamount(int a)
	{
		amount=a+50;
		System.out.println("total amount="+amount);
	}
}
public class q7_piggi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.print("enter the amount to be added:");



addamount obj=new addamount();
System.out.println("available amount:"+obj.amount);
System.out.println("enter amount:");
Scanner s= new Scanner(System.in);
int b=s.nextInt();

addamount obj2=new addamount(b);
	}

}
