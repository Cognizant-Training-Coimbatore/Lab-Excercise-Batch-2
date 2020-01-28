package demo;

import java.util.Scanner;

public class count_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]=new int[5];
		System.out.println("Enter 5 numbers");
		Scanner scanner=new Scanner(System.in);
		for(int j=0;j<5;j++)
			i[j]=scanner.nextInt();
		int x=0;
		for(int k=0;k<5;k++)
		{
			if(i[k]%2==1)
				x++;
		}
		System.out.println("Count of of odd numbers "+x);
	}

}
