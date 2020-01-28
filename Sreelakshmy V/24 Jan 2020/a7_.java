import java.util.Scanner;

class AddAmount
{
	AddAmount()
	{
		int amount=50;
		System.out.println("Initial Amount=" +amount);
	}
	AddAmount(int a)
	{
		int c;
		c=a+50;
		System.out.println("New amount=" +c);
	}
}
public class a7_ {

	public static void main(String[] args) {
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter additional amount");
		p=sc.nextInt();
AddAmount ob=new AddAmount();
AddAmount ob1=new AddAmount(p);
	}

}
