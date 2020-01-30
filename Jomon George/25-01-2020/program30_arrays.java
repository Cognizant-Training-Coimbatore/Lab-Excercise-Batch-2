package demo;

import java.util.Scanner;

public class program30_arrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter No of elements: ");
		int count = scanner.nextInt();
		int[] arr=new int[count];
		System.out.print("Enter the elements: ");
		for(int i=0;i<count;i++)
		{
			 arr[i]=scanner.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}

		System.out.println("Max : " + max);
		scanner.close();

	}

}
