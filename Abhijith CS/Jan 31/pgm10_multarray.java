package exercise_jan31;

import java.util.Scanner;

public class pgm10_multarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[]=new int[5];
		int num2[]=new int[5];
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the elements of first array:   ");
		for(i =0;i<5;i++)
		{
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array:   ");
		for( i =0;i<5;i++)
		{
			num2[i]=sc.nextInt();
		}
		for( i =0;i<5;i++)
		{
			num1[i]=num1[i]*num2[i];
		}
		System.out.println("Mutiplied result");
		for(i=0;i<5;i++)
		{
			System.out.print(num1[i]+" ");
		}
	}

}
