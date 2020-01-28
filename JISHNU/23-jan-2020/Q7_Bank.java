package Jishnu;
class AddAmount
{
	int amount=50;
	AddAmount(int add)
	{
		amount=amount+add;
	}
	AddAmount()
	{
		amount=amount;
	}
	void print()
	{
		System.out.println("Final Balance: "+amount);
	}
	
}
public class Q7_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount obj=new AddAmount(50);
		AddAmount obj2=new AddAmount();
		obj.print();
		obj2.print();
	}

}
