package jan31;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
		System.out.println("Enter array");
		int array[]= new int[n];
		for(int i=0; i<n;i++)
		{
			array[i]=input.nextInt();
			
		}
		System.out.println("Enter the key");
		int key=input.nextInt();
		int i=0;
		while(i<=n) {
			if(array[i]==key)
				System.out.println("key is present");
			else
				System.out.println("key is not present");
			n--;
	}
		
		
	}

}
