import java.util.Scanner;

class AddAmount
{
	int am=50;
	AddAmount()
	{
		System.out.println("no amount will be added to the bank" + am);
	}
	AddAmount(int a)
	{
		am=am+a;
		System.out.println("total amount in the bank: " + am);
	}

}
public class pgm39_piggie_bank {

	public static void main(String[] args)
	{
		System.out.println("enter the amount");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		AddAmount obj=new AddAmount();
		AddAmount obj1=new AddAmount(n);

	}

}
