import java.util.Scanner;

public class program21_switch_case_electricity {

	public static void main(String[] args) {
		int unit,oldm,newm;
		float price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new meter reading");
		newm=sc.nextInt();
		System.out.println("Enter old meter reading");
		oldm=sc.nextInt();
		unit=newm-oldm;
		System.out.println("No.of units consumed is.."+unit);
		if (unit>=1 && unit<=100)
		{
          System.out.println("Price is FREE");
		}
		else if (unit>=101 && unit<=200)
		{
			 System.out.println("Price is Rs.1");
		}
		else if (unit>=201 && unit<=300)
		{
			 System.out.println("Price is Rs.2");
		}	
		else if (unit>=301 && unit<=400)
		{
			 System.out.println("Price is Rs.3");
		}	
		else if (unit>=401)
		{
			 price= 4+(40/100);
			 System.out.println("Price is Rs.4 plus 10% tax which is "+price);
		}	
	}

}
