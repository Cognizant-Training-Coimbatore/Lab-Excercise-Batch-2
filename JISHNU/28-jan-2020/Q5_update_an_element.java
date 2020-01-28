package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_update_an_element {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();

		list1.add(25);
		list1.add(30);
		list1.add(35);
		list1.add(40);
		list1.add(45);
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter 3rd element");
		n=sc.nextInt();
		list1.set(2,n);//add element in the first position
		for(Integer s:list1)
		{
			System.out.println(s);
		}
		sc.close();
	}

}
