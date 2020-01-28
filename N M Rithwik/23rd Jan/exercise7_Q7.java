class AddAmount
{
	int amount = 50;
	AddAmount()
	{
		amount=amount+0;
	}
	AddAmount(int a)
	{
		amount=amount+a;
	}
}
public class exercise7_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		AddAmount obj1 = new AddAmount();
		AddAmount obj2 = new AddAmount(100);
		System.out.println("Default : " + obj1.amount);
		System.out.println("Added : " + obj2.amount);
	}

}
