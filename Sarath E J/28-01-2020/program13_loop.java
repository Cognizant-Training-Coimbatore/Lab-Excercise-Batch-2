package sol.java;

import java.util.ArrayList;

public class program13_loop 
{
	static void printArray(int myarray[])
	{
		for(int i:myarray)
		{
			System.out.println(i);
		}
		
	}
	static void printArrayList(ArrayList list1)
	{
		for(Object x:list1)
		{
			System.out.println(x);
		}
	}
	
	public static void main(String[] args)
	{
		int n[] = new int[5];
		n[0] = 10;
		n[1] = 2;
		n[3] = 3;
		printArray(n);
		ArrayList my = new ArrayList();
		my.add("item1");
		my.add("item2");
		my.add("item3");
		printArrayList(my);

	}

}
