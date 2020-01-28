package demo;

import java.util.Scanner;

public class activity12_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int cost=0;
Scanner s=new Scanner(System.in);
System.out.println("enter old meter reading:  ");
int a=s.nextInt();
System.out.println("enter new meter reading:  ");
int b=s.nextInt();
int unit=b-a;
System.out.println("units = :"+unit);
if(unit<100)
	cost=0;
 if((unit>101) &&(unit<200))
	cost=1*unit;
 if((unit>200)&&(unit<300))
	 cost=2*unit;
 if((unit>300)&&(unit<400))
	 cost=3*unit;
 if(unit>400)
	 cost=((4*unit)+((4*unit)/10));
	 System.out.println("bill amount:" +cost);


	
	}

}
