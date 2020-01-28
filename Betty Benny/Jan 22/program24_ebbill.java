import java.util.Scanner;

public class program24_ebbill 
{

	public static void main(String[] args) 
	{
		int a,b,bill;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter old meter reading");
		a=scanner.nextInt();
		System.out.println("Enter new meter reading");
		b=scanner.nextInt();
		bill=b-a;
		if((bill<=100) && ( bill>=1))
		{
			System.out.println("Free");
		}
		else if ((bill<=200) && ( bill>=101))
		{
			System.out.println("Pay=" + bill*1);
		}
			
		else if((bill<=300) && ( bill>=201))
		{
		System.out.println("Pay= " + bill*2);
		
		}
		else if((bill<=400) && ( bill>=301))
		{
			System.out.println("Pay= " + bill*3);
		}
		else 
		{
			int amount=(bill*4);
		
			System.out.println("Pay= " +(amount+(amount*( 10/100))));
		}
	}
	
		
}
