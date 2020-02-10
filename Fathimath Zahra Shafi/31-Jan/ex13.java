package practical_exercises;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k,sum=0,s=0,n,i;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		System.out.println("enter n");
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		
		System.out.println("enter k");
		k=scanner.nextInt();
		
		for(i=0;i<k;i++)
		{
			s+=a[i];
		}
		
		
		

	}

}
