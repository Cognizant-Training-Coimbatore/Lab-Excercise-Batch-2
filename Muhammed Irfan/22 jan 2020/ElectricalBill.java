package demo;

import java.util.Scanner;

public class ElectricalBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the previous units used");
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		System.out.print("Enter the current units used");
		int b=scan.nextInt();
	    int u=b-a;
	    if(u=<100)
	    {
	    	System.out.print("You have no amount to pay..\nYou saved the energy \nhave a nice Day \n"
	    			+ "KSEB");
	    }
	    if(u<=200 && u>100)
	    {
	    	int s=u*1;
	    	System.out.print("Your have Electrical bill is "+s+"Rupeees..\nhave a nice Day\n KSEB");
	    }
	    if(u<=300 && u>200)
	    {
	    	int s=u*2;
	    	System.out.print("Your have Electrical bill is "+s+"Rupeees..\nhave a nice Day \nKSEB");
	    }
	    if(u<=400 && u>300)
	    {
	    	int s=u*3;
	    	System.out.print("Your have Electrical bill is "+s+"Rupeees..\nhave a nice Day \nKSEB");
	    }
	    if(u>400)
	    {
	    	int s=u*4;
	    	double t=s*0.1;
	    	double x=s+t;
	    	
	    	System.out.print("Your have Electrical bill is "+x+"Rupeees..\n have a nice Day \n KSEB");
	    }
	}

}
