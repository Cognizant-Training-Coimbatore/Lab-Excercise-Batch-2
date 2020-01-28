package day4;

import java.util.Scanner;

public class Q9_sequential_search {
	String a[]=new String [10];
	String search;
	int found;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++)
			a[i]=sc.nextLine();
	}
	void search()
	{
		System.out.println("Enter the element to search");
		search=sc.nextLine();
		for(int i=0;i<10;i++)
		{
			if(a[i].contentEquals(search))
			{
				System.out.println("Element is present");
				i=10;
				found=1;
			}
		}
		if(found!=1)
			System.out.println("Element not found");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q9_sequential_search obj=new Q9_sequential_search();
		obj.get();
		obj.search();

	}

}
