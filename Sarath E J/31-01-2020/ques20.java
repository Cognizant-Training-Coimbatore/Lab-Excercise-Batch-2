package jan31;

import java.util.ArrayList;
import java.util.Scanner;


public class ques20 {

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
		System.out.println("Enter the element to be removed");
		int n = sc.nextInt();
		arr.remove(new Integer(n));
		System.out.println(arr);
	
	}

}
