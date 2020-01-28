package demo;

import java.util.Random;
import java.util.Scanner;

public class q14_picknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("i am thinking about a number between 0 and 9.Can you guess it ?"+"/n"+"(3 attempts left)");
Random r=new Random();

int guess=r.nextInt(10);

for(int i=2;i>=0;i--)
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	
	if(guess!=a)
	{
		System.out.println("Sorry wrong number,only "+i+" attempts left");
}
else 
{
	System.out.println("yes you are right!!!!!");
	
}

	}
System.out.println("the number was "+guess);
}}
