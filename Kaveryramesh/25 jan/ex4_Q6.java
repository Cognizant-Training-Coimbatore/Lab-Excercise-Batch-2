package new_demo_pack;

import java.util.Scanner;

public class ex4_Q6 {

	public static void main(String[] args) {
		int i,sum=0;
	
		// TODO Auto-generated method stub
		int[] a=new int[5];
		System.out.println("Enter 5 numbers");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum is"+sum);
		System.out.println("average is"+(sum/5));
		
		

	}

}
