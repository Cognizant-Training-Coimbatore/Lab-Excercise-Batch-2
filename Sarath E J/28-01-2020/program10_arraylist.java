package sol.java;

import java.util.ArrayList;
import java.util.List;

public class program10_arraylist {

	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("Total Items "+mylist.size());
		System.out.println("Testing item4 exists : "+mylist.contains("item4"));
		System.out.println(mylist);
		System.out.println("Removing item3");
		mylist.remove("Item3");
		System.out.println(mylist);
		System.out.println("Total Items : "+mylist.size());
	}

}
