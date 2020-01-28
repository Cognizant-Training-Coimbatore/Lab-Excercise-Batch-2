class addAmount
{
	int amount=50,amount1;
	addAmount()
	{
		System.out.println("no amount will be added to piggie bank");
		
	}
	addAmount(int a)
	{
		amount1=a;
		System.out.println("Amount added to the piggie bank");
		System.out.println("Final amount:" + (amount+amount1));
		
	}
}
public class program52_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finalamount;
		addAmount obj1=new addAmount();
		addAmount obj2=new addAmount(100);

	}

}
