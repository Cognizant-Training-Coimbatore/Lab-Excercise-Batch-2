package package2;

import java.util.Scanner;

public class qn_6_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i; 
		
		float sum=0,num;
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		int count=0;
	while((num=sc.nextInt())!=-999)
		{
			sum=sum +num;
			count++;
		}
		
		System.out.println("sum is " +sum);
		float avg=sum/count;
		System.out.println("average is" +avg);
	

	}

}
