package pack2;

import java.util.Scanner;

public class class6_inputno_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nos");
		for(int i=0;i<5;i++) {
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		int avg=sum/5;
		System.out.println("sum:"+sum+"  average:"+avg);

	}

}
