package classD;

import java.util.Scanner;

public class demoA7 {

	public static void main(String[] args) {
	int sum=0;
	Scanner input=new Scanner(System.in);
	demoA7 obj=new demoA7();
	System.out.println("enter 5 numbers");
	int a[]=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=input.nextInt();
		sum=sum+a[i];
	}
	System.out.println("sum is"+sum);
	System.out.println("average is:"+sum/5);

	}

}
