package gokul;

import java.util.Scanner;

class AddAmount
{
	int AddAmount()
	{
	  return 0;
	  
	}
	
	int AddAmount(int amt)
	{
		int a=amt;
		return a;
		
	
	}
}
public class program37_PiggieBank 
{
	

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int amount=50;
	  System.out.println("Enter the amount to be deposited");
	  int cashdeposit=sc.nextInt();
	  AddAmount s=new AddAmount();
	  if(cashdeposit==0)
	  {
	  int noamt=s.AddAmount();
	  amount=amount+noamt;
	  System.out.println("The total amount "+amount);
	  }
	  else  
	  {
	  int add=s.AddAmount(cashdeposit);
	  amount=amount+add;
	  System.out.println("The total amount "+amount);
	  }
		
	}
	

}
