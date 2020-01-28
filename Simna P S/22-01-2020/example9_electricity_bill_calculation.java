import java.util.Scanner;

public class example9_electricity_bill_calculation 
{

	public static void main(String[] args) 
	{
		int oldmeter,newmeter,unit;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the New meter reading: ");
		newmeter = scanner.nextInt();
		System.out.println("enter the Old meter reading: ");
		oldmeter = scanner.nextInt();
		
		unit=newmeter-oldmeter;
		
		if(unit>=1 && unit<101) 
		{
			System.out.println("Electricity Bill: 0.00");
		}
		else if(unit>=101 && unit<200) 
		{
			System.out.println("Electricity Bill: "+ (unit*1));
		}
		else if(unit>=201 && unit<300) 
		{
			System.out.println("Electricity Bill: "+ (unit*2));
		}
		else if(unit>=301 && unit<400) 
		{
			System.out.println("Electricity Bill: "+ (unit*3));
		}
		
		else 
		{
			System.out.println("Electricity Bill: "+ (1.1*unit*4));
		}
	}

}
