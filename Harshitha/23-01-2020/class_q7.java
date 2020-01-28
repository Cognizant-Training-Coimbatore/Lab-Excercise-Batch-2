import java.util.Scanner;

class AddAmount{
	int amount;
	public AddAmount() 
	{
	    amount = 50;
	}
	void Amount(int add)
	{
		amount = amount + add;
		System.out.println("The amount is : " + amount);
	}
	
}
public class class_q7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be added");
        int a = sc.nextInt();
        AddAmount ob = new AddAmount();
         ob.Amount(a);
	}

}
