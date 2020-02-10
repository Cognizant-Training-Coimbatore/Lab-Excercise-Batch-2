package practical_exercises;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,c=0;
		System.out.println("enter a number");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		
	while(n%4==0)
	{
		n=n/4;
		c++;
	}
	
	if(Math.pow(4,c)==n)
			System.out.println("number is a power of 4");
		else
			System.out.println("number is not a power of 4");
		
		
		
	}

}
