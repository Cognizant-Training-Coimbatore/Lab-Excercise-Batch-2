package exercise_jan31;

import java.util.Scanner;

public class pgm8_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((b>a)&&(c>b))
		{
			System.out.println("TRUE");
		}
	}

}
