package demo;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter old meter reading");
		Scanner a=new Scanner(System.in);
		int oldread=a.nextInt();
		System.out.println("enter new meter reading");
		Scanner b=new Scanner(System.in);
		int newread=b.nextInt();
		int c=newread-oldread;
		System.out.println("consumed units"+c);
		if(c>=1&&c<=100) {
			System.out.println("Free");
		}
		else if(c>=1001&&c<=200) {
			System.out.println("pay "+c*1);
		}
		else if(c>=201&&c<=300) {
			System.out.println("pay"+c*2);
		}
		else if(c>=301&&c<=400) {
			System.out.println("pay"+c*3);
		}
		else {float tax=(float)10/100*c*4;
			System.out.println("pay"+(c*4+tax));
		}
		

	}

}
