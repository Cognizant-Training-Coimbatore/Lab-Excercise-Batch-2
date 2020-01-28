package demo;

import java.util.Scanner;

public class countoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of inputs=");
		int count=0;
		Scanner b=new Scanner(System.in);
		int n=b.nextInt();
		System.out.println("enter values");
	
		for(int i=0;i<n;i++) {
			Scanner a=new Scanner(System.in);
			int c=a.nextInt();
			if(c%2!=0) {
				count++;
			}
			
			
		}
		System.out.println("odd numbers="+count);

	}

}
