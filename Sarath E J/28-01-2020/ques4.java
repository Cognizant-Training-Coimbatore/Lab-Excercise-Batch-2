package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class ques4 {

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
		System.out.println("Enter the position of the element to be retrieved : ");
		int n;
	
		n = sc.nextInt();
		
	
		System.out.println(arr.get(n));

	}

}
