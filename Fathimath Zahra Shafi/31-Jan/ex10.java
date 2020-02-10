package practical_exercises;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter n");
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int p[]=new int[n];
		
		int i,prod=1;
		
		System.out.println("enter elements of first array");
		for(i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
			
		
		System.out.println("enter elements of second array");
		for(i=0;i<n;i++)
		{
			b[i]=scanner.nextInt();
			p[i]=a[i]*b[i];
			
		}
			
	
		System.out.println("product array is: ");
		
		for(i=0;i<n;i++)
			
		{
			System.out.println(p[i]);
		}
	}

}
