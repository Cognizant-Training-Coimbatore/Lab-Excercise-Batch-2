package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class ques7 {

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<5;i++)
		{	
			int m = sc.nextInt();
			arr.add(m);
			
		}
		System.out.println(arr);
		System.out.println("Enter the element to be inserted : ");
		int n;
	
		n = sc.nextInt();
		
	
		arr.set(1,n);
		System.out.println("The updated array is : ");
		System.out.println(arr);
	}

}
