package demo;

import java.util.ArrayList;

public class program49_arrayAndArrayList {

	static void printArray(int myarray[])
	{
		for(int x : myarray)
			System.out.println(x);
	}
	static void printArrayList(ArrayList list)
	{
		for(Object obj : list)
		{
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no[]= {10,2,3,4,5,6};
		printArray(no);
		
		ArrayList mylist = new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		printArrayList(mylist);
	}

}
