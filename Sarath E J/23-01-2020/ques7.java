class AddAmount
{
	int amount = 50;
	
	AddAmount() 
	{
		System.out.println("Balance="+amount);
	}
	
	AddAmount(int a)
	{
		amount+=a;
		System.out.println("Balance ="+amount);
	}
}
public class amount34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AddAmount obj1 = new AddAmount();
			AddAmount obj2 = new AddAmount(150);
				
	}

}
