class Addamount
{
	int amount=50,amount1;
	Addamount()
	{
		System.out.println("No amount added to piggie bank");
	}
	Addamount(int a)
	{
		amount1=a;
		System.out.println("Amount is added to piggie bank");
		System.out.println("Final amount:" +(amount+amount1));
		
	}
}
public class prog39_piggie_bank {

	public static void main(String[] args) {
		Addamount obj1=new Addamount();
		Addamount obj2=new Addamount(100);
		
		// TODO Auto-generated method stub

	}

}
