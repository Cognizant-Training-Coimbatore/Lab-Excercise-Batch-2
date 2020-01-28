package packB;

import java.util.Scanner;

public class ques7 {

	public static void main(String[] args) 
	{
		
		int[] a = new int[5];
		int[] b = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("ist Array is: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
			
			
			
		}
		System.out.println("2nd Array is: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
	}

}
