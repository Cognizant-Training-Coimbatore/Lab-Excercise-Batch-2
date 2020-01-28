import java.util.Scanner;
class Addamount
{
	int amount;
	Addamount()
	{
		amount=50;
		System.out.println("amount="+amount);
	}
	Addamount(int x)
	{
		amount =x+50;
		System.out.println("amount="+amount);
	}
}
public class Q7_piggiebank {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the extra amount");
	int extraamount=sc.nextInt();
	if(extraamount!=0)
	{
		Addamount obj2=new Addamount(extraamount);
	}
	else
	{
		Addamount obj1=new Addamount();
		
	}
	}

}
