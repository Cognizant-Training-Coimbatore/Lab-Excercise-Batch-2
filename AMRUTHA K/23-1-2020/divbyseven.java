package demo;

import java.util.Scanner;

public class divbyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no");
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		if(x%7==0) {
			System.out.println("divisible");
		}
		else {
			
			System.out.println("not divisible");
		} 

	}

}
