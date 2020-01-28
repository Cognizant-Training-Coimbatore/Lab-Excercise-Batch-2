package packB;

import java.util.Scanner;

public class ques6 {

	public static void main(String[] args)
	{
		
		int sum=0,avg=0;
		int arr[] = new int[5];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		avg=sum/5;
		System.out.println("SUM = "+sum);
		System.out.println("AVERAGE = "+avg);

	}

}
