import java.util.Scanner;

public class example13_electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastUnit, thisUnit , unit;
		float bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last months unit : ");
		lastUnit = sc.nextInt();
		System.out.println("Enter the current months unit : ");
		thisUnit = sc.nextInt();
		unit = thisUnit - lastUnit;
		if(unit>=0 && unit <=100)
			bill = unit * 0;
		else if(unit>=101 && unit<=200)
			bill = unit * 1;
		else if(unit>=201 && unit<=300)
			bill = unit * 2;
		else if(unit>=301 && unit<=400)
			bill = unit * 3;
		else if(unit>=401)
		{
			bill = unit * 4;
			bill=bill+((bill*10)/100);
		}
		System.out.println("Bill amount is : " + bill);
	}
}
