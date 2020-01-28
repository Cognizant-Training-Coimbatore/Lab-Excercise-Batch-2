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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to be added");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		AddAmount obj=new AddAmount(b);
		AddAmount obj1=new AddAmount();
		
	}

}
