package exercise_jan31;

import java.util.Scanner;

public class pgm6_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number : ");
		num= sc.nextInt();
		if(num%2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		}

}
