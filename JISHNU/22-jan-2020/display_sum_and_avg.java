package demo;

import java.util.Scanner;

public class display_sum_and_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]=new int[5];
		System.out.println("Enter 5 numbers");
		Scanner scanner=new Scanner(System.in);
		for(int j=0;j<5;j++)
			i[j]=scanner.nextInt();
		int x=0,y=0;
		for(int k=0;k<5;k++)
			x=x+i[k];
			y=x/5;
		System.out.println("Sum="+x+" Average="+y);
	}

}
