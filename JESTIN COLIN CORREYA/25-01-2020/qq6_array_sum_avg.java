package demo;

import java.util.Scanner;

public class qq6_array_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
int num[]=new int[5];
System.out.print("enter 5 numbers:");
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
	int a=s.nextInt();
	sum+=a;
	
}
System.out.println("the sum=:"+sum);
float avg=sum/5;
System.out.println("average=:"+avg);
	}

}
