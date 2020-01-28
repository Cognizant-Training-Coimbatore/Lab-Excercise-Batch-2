

class AddAmount
{
int sum,amount=50;
public void noAmount()
{
	System.out.println("The final amount is "+amount);
}
public void yesAmount(int money)
{
	sum=money+amount;
	System.out.println("The final amount is "+sum);
}

}
public class program37_Question7 {

	public static void main(String[] args) {
		
AddAmount ad=new AddAmount();
ad.noAmount();
ad.yesAmount(600);
	}

}
