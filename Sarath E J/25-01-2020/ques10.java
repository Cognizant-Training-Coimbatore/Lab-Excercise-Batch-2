package packB;

import java.util.Scanner;

public class ques10 {

	public static void main(String[] args) 
	{
		int number,smaller;
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		System.out.println("Enter number 0");
		number = sc.nextInt();
		smaller = number;
		for(int i=1;i<5;i++)
		{
			System.out.println("Enter number "+i);
			number = sc.nextInt();
			num[i]=number;
			if(number<smaller)
			{
				smaller = number;
			}
		}
		
		System.out.println("SMALLEST NUMBER IS "+smaller);
		

	}

}
