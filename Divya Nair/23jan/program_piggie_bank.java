import java.util.Scanner;

class AddAmount
{
	int amount=50,amount1;
	AddAmount()
	{
		System.out.println("No amount added to the piggie bank:" +amount);
	}
	AddAmount(int a)
	{
		amount1=a;
		System.out.println("Amount added to the piggie bank:" +amount1);
		System.out.println("Final amount:"+(amount+amount1));
	}
	
	
	
}
public class program_piggie_bank {

	public static void main(String[] args) 
	{	
		int finamount;
		AddAmount obj1=new AddAmount();
		AddAmount obj2=new AddAmount(100);
		
		
	

	}

}
