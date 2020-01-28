package classworkA;

import java.util.Random;
import java.util.Scanner;

public class question9_sequential {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n[]=new int[10];
		Random rand=new Random();
		
		for(int i=0;i<5;i++) 
		{
			n[i]=rand.nextInt(100);	
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.println("Enter number to be searched ");
		int a=sc.nextInt();
		
		for(int i=0;i<10;i++)
		{
			if(a==n[i])
				System.out.println("Match found at "+(i+1));
		
		   
		}
		

	}

}
