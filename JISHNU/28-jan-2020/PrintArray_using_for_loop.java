package day6;

import java.util.ArrayList;

public class PrintArray_using_for_loop {
	static void printArray(int myarray[])
	{
		for(int x:myarray)
		{
			System.out.println(x);
		}
	}
	static void printArrayList(ArrayList<String> list1)
	{
		for(Object obj:list1)
		{
			System.out.println(obj);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]=new int[3];
		no[0]=12;
		no[1]=13;
		no[2]=15;
		printArray(no);
		ArrayList<String> mylist=new ArrayList<String>();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		printArrayList(mylist);

	}

}
