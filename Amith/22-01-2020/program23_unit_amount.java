import java.util.Scanner;

public class program23_unit_amount {

	public static void main(String[] args)
	{
	int oldr,newr,unit,fee;
	System.out.println("enter your old reading");
	Scanner scanner= new Scanner(System.in);
	oldr=scanner.nextInt();
	System.out.println("enter your new reading");
	newr=scanner.nextInt();
	unit=newr-oldr;
		if(unit>0 && unit<101)
		{
		System.out.println("freee");
		}
		else if(unit>100 && unit<201)
		{
			System.out.println("fee is "+unit);
		}
		else if(unit>200 && unit<301)
		{
			System.out.println("fee is "+(2*unit));
		}
		else if(unit>300 && unit<401)
		{
			System.out.println("fee is "+(3*unit));
		}
		else
		{
			fee=(4*unit);
			float amount=fee*10/100;
			System.out.println("fee is "+(amount+fee));
		}
	}

}
