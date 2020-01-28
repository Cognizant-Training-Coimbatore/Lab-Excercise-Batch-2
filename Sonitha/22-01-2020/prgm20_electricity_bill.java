import java.util.Scanner;

public class prgm20_electricity_bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the old meter reading");
		int old_meter =sc.nextInt();
		System.out.println("Enter the new meter reading");
		int new_meter = sc.nextInt();
		int units_consumed = new_meter - old_meter;
		System.out.println("Number of units consumed : "+ units_consumed);
		if(units_consumed>0 && units_consumed<101)
		{
			System.out.println("Free");
		}else
		{
			if(units_consumed>100 && units_consumed <201)
			{
				System.out.println("Rs."+(units_consumed*1));
			}else
			{
				if(units_consumed>200 && units_consumed<301)
				{
					System.out.println("Rs."+(units_consumed*2));
				}else
				{
					if(units_consumed>300 && units_consumed<401)
					{
						System.out.println("Rs."+(units_consumed*3));
					}else
					{
						int amount = (units_consumed*4);
						System.out.println("Rs."+(amount+(amount *0.1)));
					}
						
			}
		}

	}

}}
