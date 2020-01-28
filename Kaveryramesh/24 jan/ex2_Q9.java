package demo;

import java.util.Random;
import java.util.Scanner;

public class ex2_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range within which random number should be generated");
		   Scanner s=new Scanner(System.in);
		   int n=s.nextInt();
		   Random rand=new Random();
			int t=rand.nextInt(n);
            System.out.println("generated number is "+t);
	}

}
