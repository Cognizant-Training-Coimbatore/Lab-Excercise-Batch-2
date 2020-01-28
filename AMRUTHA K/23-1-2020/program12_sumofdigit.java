package demo;

import java.util.Scanner;

public class program12_sumofdigit {

	public static void main(String[] args) {
		System.out.println("enter a no");
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		int sum=0;
		while(x!=0)
		{int s=x%10;
		x=x/10;
		sum+=s;
		}
		System.out.println("sum="+sum);
	}

}
