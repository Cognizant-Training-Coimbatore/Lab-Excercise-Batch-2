class addamount
{
	int amount=50;
	addamount()
	{
		System.out.println("Amount: "+amount);
	}
	addamount(int a)
	{
		a=a+amount;
		System.out.println("new amount:" +a);
	}
	
}
public class piggie_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addamount obj=new addamount();
		
		addamount obj1=new addamount(500);
		

	}

}
