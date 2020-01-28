package demo;

import java.util.Scanner;

public class program6_input5nos {

	public static void main(String[] args) {
		int x,y,sum=0;
		System.out.println("enter 5 numbers");
		for(int i=0;i<5;i++)
		{Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		
	      sum=sum+x;
		}
		float avg=(float)sum/5;
		System.out.println("sum="+sum+"avg="+avg);

	}

}
