class AddAmount
{
	int amount=50;
	AddAmount()
	{
		System.out.println("The final amount is 50");
	}
	AddAmount(int a)
	{
		System.out.println("The final amount is " +(amount+a));
	}
}


public class Program37 {

	public static void main(String[] args) {
		AddAmount obj1 = new AddAmount();
		AddAmount obj2 = new AddAmount(200);
		}

}
