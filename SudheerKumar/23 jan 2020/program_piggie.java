class bank{
	int x=50;
	void addAmount()
	{
		int a;
		a=x;
	}
	bank()
	{
		System.out.println("no amount is added to bank");
	}
	bank(int y)
	{
		System.out.println("added amount in bank is:"+(x+y));
	}
}
public class program_piggie {

	public static void main(String[] args) {
		bank obj=new bank();
		bank obj2=new bank(10);
		obj.addAmount();
		// TODO Auto-generated method stub
     
	}

}
