package demo;

import java.util.Random;
import java.util.Scanner;

public class ex_Q4 {

	public static void main(String[] args) {
		int i;
	Random rand=new Random();
		int n=rand.nextInt(10);
//		System.out.println(n);
		Scanner s=new Scanner(System.in);
		for(i=3;i>0;i--)
		{
		System.out.println("I'm thinking of a number between 0-9 .can u guess it? "+i+
				" attempts left");
		
		        int number=s.nextInt();
		        if(number==n)
		        	{ System.out.println("correct answer");
		        	   break;
		        	}
		        else  
		        System.out.println("sorry wrong answer");
		        	
		}	
		if(i==0)
		{
			System.out.println("The correct answer is "+n);
		}

	}

}
