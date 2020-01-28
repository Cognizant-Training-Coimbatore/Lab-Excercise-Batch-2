package demo11;

import java.util.Scanner;

public class class4_guessno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("iam thinking a number b/w 0 and 9,u have 3 chances to guess it");

		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		if(b==x) {
			System.out.println("correct");
		}
		else
			System.out.println("wrong,u have 2 more chance");
			 b=a.nextInt();
		
		if(b==x) {
			System.out.println("currect");
			 
		}
		else 
			System.out.println("wrong,u have 1more chance");
		    b=a.nextInt();
		if(b==x){
			System.out.println("currect");
			 
		}
		else
			System.out.println("wrong ,the currect no is 5");
		
	}

}
