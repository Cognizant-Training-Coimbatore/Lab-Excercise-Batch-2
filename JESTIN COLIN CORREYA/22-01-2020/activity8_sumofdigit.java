package demo;

import java.util.Scanner;

public class activity8_sumofdigit {

	public static void main(String[] args) {
		int sum=0,a,b;
		// TODO Auto-generated method stub
		System.out.print("enter any number:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a!=0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
			
		}
		System.out.println("the sum of digit will be:" +sum);

	}

}
