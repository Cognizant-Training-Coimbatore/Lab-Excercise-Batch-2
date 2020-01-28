package pack1;

import java.util.Scanner;

public class demoA6 {

	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);
		demoA6 obj = new demoA6();
		System.out.println("Enter 5 numbers");
		int a[]= new int[5];
		for(int i=0; i<5;i++)
		{
			a[i]=input.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Average is:" +sum/5);
		
	}

}
