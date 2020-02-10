package practical_exercises;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key,n,i,flag=0;
		System.out.println("enter n");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int a[]=new int[n];
		
	System.out.println("enter elements of array");
		
		for(i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();			
			
		}
		System.out.println("enter value to be searched");
		key=scanner.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==key)	
				flag=1;
				
			
		}
		if(flag==1)
			System.out.println("array contains the value");
		else
			System.out.println("array does not contain the value");
			
		
		
		

	}

}
