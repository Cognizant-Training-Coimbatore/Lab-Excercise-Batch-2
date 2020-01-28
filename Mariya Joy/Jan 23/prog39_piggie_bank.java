class AddAmount
{
	int amount=50,final1;
	AddAmount()
	{
		System.out.println("No amount is added");
	}
	AddAmount(int a)
	{
		final1=a;
		System.out.println("Amount is added");
		System.out.println("Amount added is: "+(amount+final1));
		
	}
	
}
public class prog39_piggie_bank {

	public static void main(String[] args)
	{
		AddAmount obj1=new AddAmount();
		AddAmount obj2=new AddAmount(100);
		// TODO Auto-generated method stub

	}

}
