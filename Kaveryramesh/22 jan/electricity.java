package demo;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) {
		int x,y;
		double units;
		Scanner s=new Scanner(System.in);
	System.out.println("enter new meter reading");
	      x=s.nextInt();
	  	System.out.println("enter old meter reading");
	      y=s.nextInt();
	      
	      units=x-y;
	      if(units>1 && units<100)
			{
				System.out.println("free");
				
			}
			else if(units>101 && units<200)
			{
				System.out.println(units);
				
			}
			else if(units>201 && units<300)
			{
				System.out.println(units*2);
				
			}
			else if(units>301 && units<400)
			{
				System.out.println(units*3);
				
			}
			
			else if(units>401)
			{
				System.out.println(4.4*units);
				
			}
			
	}

}
