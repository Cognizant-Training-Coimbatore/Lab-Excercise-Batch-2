import java.util.Scanner;

public class exercise12_electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int old,newm,units;
		double price;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter old meter reading");
		
		old= scanner.nextInt();
		System.out.println("enter new meter reading");
	
		newm= scanner.nextInt();
		
		units = newm-old;
		
		if(units>=1 && units<=100)
			System.out.println("electricity bill : free");
		else if(units>=101 && units<=200)
			
			System.out.println("electricity bill : " +units);
		else if(units>=201 && units<=300)
			{price = 2*units;
			System.out.println("electricity bill : " +price);}
		else if(units>=301 && units<=400)
			{price=3*units;
			System.out.println("electricity bill : " +price);}
		else if(units>=401)
			{price = 4.4*units;
		System.out.println("electricity bill : " +price);}
		
		
		
		
		
		

	}

}
