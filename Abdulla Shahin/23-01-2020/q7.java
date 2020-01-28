import java.util.Scanner;

class AddAmount
{
	int amount=50;
	AddAmount()
	{
		System.out.println(amount);
	}
	AddAmount(int credit)
	{
		amount=amount+credit;
		System.out.println(amount);
	}
}
public class q7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to be added:");
		int value = sc.nextInt();
		AddAmount obj = new AddAmount(value);
		AddAmount obj1 = new AddAmount();
		
		

	}

}
