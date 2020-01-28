package demo;

import java.util.Scanner;

public class program19_electricity_bill
{

	public static void main(String[] args)
	{
		
		float oldr,newr,units;
		double bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the old readings");
		oldr=sc.nextFloat();
		System.out.println("Enter the new readings");
		newr=sc.nextFloat();
		units=newr-oldr;
		if(units>400)
		{	units=units-400;
			bill=100+200+300+4*units;
			bill=1.1*bill;
		}
		else if(units>300)
		{
			units=units-300;
			bill=100+200+3*units;
		}
			
		else if(units>200)
		{	units=units-200;
			bill=100+units*2;
		}
		else if(units>100)
		{	units=units-100;
			bill=units;
		}
		else
			bill=0;
		System.out.println("Electricity bill is Rs."+bill);
		

	}

}
