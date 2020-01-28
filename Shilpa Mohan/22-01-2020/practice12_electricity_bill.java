import java.util.Scanner;

public class practice12_electricity_bill {

	public static void main(String[] args) {
		int old=0;
		int neww=0;
		int units=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the old bill amount:");
		old=sc.nextInt();
		System.out.println("Enter the new bill amount:");
		neww=sc.nextInt();
		units=neww-old;
		if(units>=1 && units<=100)
		{
			System.out.println("Free");
		}
		else if(units>=101 && units<=200)
		{
			System.out.println(units*1);
		}
		else if(units>=201 && units<=300)
		{
			System.out.println(units*2);
		}
		else if(units>=301 && units<=400)
		{
			System.out.println(units*3);
		}
		else
		{
			int amount=(units*4);
			System.out.println(amount+(amount*10/100));
		}
	}

}
