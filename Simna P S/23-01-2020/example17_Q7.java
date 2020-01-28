class addamount
{
	int amount=50;
	addamount()
	{
		System.out.println("Amount= "+amount);
	}
	addamount(int a)
	{
		a=a+amount;
		System.out.println("Amount= "+a);
	}
}
public class example17_Q7 
{

	public static void main(String[] args) 
	{
		
		addamount obj1 = new addamount();
		addamount obj2 = new addamount(20);
		
		
	}

}
