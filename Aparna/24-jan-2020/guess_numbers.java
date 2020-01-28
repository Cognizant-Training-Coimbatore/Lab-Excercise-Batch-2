package package2;

import java.util.Scanner;

public class guess_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int a;
		System.out.println("Iam thinking of a number between 0 and 9.Can you guess it ");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		if(a==num)
		{
			System.out.println("correct");
		}
		else 
			System.out.println(" wrong answer!2 attempts left");
		a=scanner.nextInt();
		if(a==num) 
		{
			System.out.println("correct");
		}
		else 
			System.out.println(" wrong answer!1 attempts left");
		a=scanner.nextInt();
		if(a==num) 
		{
			System.out.println("correct");
		}
		else 
		{
			System.out.println("sry wrong number. The crct answer is 7");
		}
		

	}

}
