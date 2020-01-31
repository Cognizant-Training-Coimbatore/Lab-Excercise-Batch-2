package jan31;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter first number : ");
		  int a = s.nextInt();
		  System.out.print("Enter second number : ");
		  int b = s.nextInt();
		  System.out.print("Enter third number : ");
		  int c = s.nextInt();
		  if(b>a && c>b)
			  System.out.print("True");
		  else
			  System.out.print("false ");

	}

}
