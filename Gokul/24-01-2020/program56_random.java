package gokul;

import java.util.Random;
import java.util.Scanner;

public class program56_random {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int n=rand.nextInt(10);
		System.out.println("The random number is :"+n);

	}

}