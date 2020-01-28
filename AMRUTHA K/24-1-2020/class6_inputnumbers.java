package demo11;

import java.util.Scanner;

public class class6_inputnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,count=0;
		System.out.println("enter nos, press -999");
		Scanner b=new Scanner(System.in);
		while(( n=b.nextInt())!=-999) {
			sum=sum+n;
			count++;
		}
		float avg=(float)sum/count;
		System.out.println("sum="+sum+"  avg="+avg);
	
      
			

	

}}
