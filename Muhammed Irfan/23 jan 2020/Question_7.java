package demo;

import java.util.*;

class bank
{
	int amount=50;
	bank()
	{
		
		 System.out.println("balance Amount is "+amount);
	}
	bank(int a)
	{
		amount=amount+a;
		 System.out.println("Balance Amount is "+amount);
	}
}

public class Question_7 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 1 for depositing and 0 for just veiwing the balance ");
		int c=scan.nextInt();
		System.out.println("Enterthe amount to be deposited");
		int b=scan.nextInt();
		if(c==0)
		{
			bank cash=new bank();
		}
		else
		{
			bank cash=new bank(b);
		}
		
	}

}
