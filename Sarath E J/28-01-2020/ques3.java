package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(3);
		arr.add(6);
		arr.add(5);
		System.out.println(arr);
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be inserted");
		n =sc.nextInt();
		arr.add(0,n);
		System.out.println(arr);
		
		

	}

}
