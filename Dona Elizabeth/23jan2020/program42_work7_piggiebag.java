class AddAmount
{
	int amt=500;
	AddAmount()
	{
		System.out.println("Final amount: "+amt);
	}
	AddAmount(int a)
	{
		amt=amt+a;
		System.out.println("Final amount: "+amt);
		
	}
}


public class program42_work7_piggiebag {

	public static void main(String[] args) {
		AddAmount obj1= new AddAmount();
		AddAmount obj2=new AddAmount(250);
	}

}
