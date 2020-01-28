package demo;

/*Suppose you have a Piggie Bank with an initial amount of $50 and you have
 *  to add some more amount to it. Create a class 'AddAmount' with a data member
 *   named 'amount' with an initial value of $50. Now make two constructors of this class 
 *   as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.

 */

class AddAmount
{
	double amount=50;
	AddAmount()
	{
		amount=amount;
	}
	AddAmount(double money)
	{
		amount=amount+money;
	}
	void display()
	{
		System.out.println("Your Piggy Bank balance is : $"+amount);
	}
	
}
public class program22g_class_piggy_bank 
{

	public static void main(String[] args) 
	{
		AddAmount a1=new AddAmount();
		AddAmount a2=new AddAmount(50);
		AddAmount a3=new AddAmount(0);
		a1.display();
		a2.display();
		a3.display();

	}

}
