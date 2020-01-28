package demo;

import java.util.Scanner;

public class Arrayscanning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the size");
		Scanner scan=new Scanner(System.in);
		int n,number,i,greater;
		int numbers[]=new int[5];
		n=scan.nextInt();
		System.out.println("enter the numbers");
		number=scan.nextInt();
		greater=number;
		for(i=1;i<n;i++)
		{
			number=scan.nextInt();
			numbers[i]=number;
			if(number>greater)
			{
				greater=number;
			}
		}
		System.out.println("Numbers are ");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+numbers[i]);
		}
		
		System.out.println("Greater number is  "+greater);
	}

}
