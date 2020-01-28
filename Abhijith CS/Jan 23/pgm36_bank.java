import java.util.Scanner;

class AddAmount
{
	int amount = 50;
	AddAmount()
	{
		amount=amount;
	}
	AddAmount(int am)
	{
		amount=amount+am;
	}
}
public class pgm36_bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag,a;
		System.out.println("Do you want to deposit? yes-1/no-0");
		flag= sc.nextInt();
		if (flag==0)
		{
			AddAmount adm = new AddAmount();
			System.out.println("Balance: "+adm.amount);
		}
		else
		{
			System.out.println("Enter the amount to be deposited: ");
			a=sc.nextInt();
			AddAmount adm1 = new AddAmount(a);
			System.out.println("Balance: "+adm1.amount);
		}
	}

}
