package jan31;

import java.util.Scanner;

public class ques6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if(n%2 == 0)
		{
			System.out.println("1");
		}
		else
			System.out.println("0");
	}

}
