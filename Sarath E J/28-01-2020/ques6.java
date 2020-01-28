package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class ques6 {

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
		System.out.println("Size of the array is : "+arr.size());
		System.out.println("Enter the new element : ");
		int n;
	
		n = sc.nextInt();
		
	
		arr.add(3,n);
		System.out.println("The updated array is : ");
		System.out.println(arr);
		System.out.println("Size of the new  array is : "+arr.size());
	}

	}


