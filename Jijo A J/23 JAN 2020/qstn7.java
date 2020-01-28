class AddAmount
{
	int amount=50;
	AddAmount()
	{
		System.out.println("Final amount : "+amount);
		
		
	}
	AddAmount(int newA)
	{
		amount+=newA;
		System.out.println("Final amount : "+amount);
		
		
	}
}
public class qstn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount xx=new AddAmount();
		AddAmount xxx=new AddAmount(60);
		
	}

}
