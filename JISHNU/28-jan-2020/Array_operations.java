package day6;

import java.util.ArrayList;
import java.util.List;

public class Array_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>mylist= new ArrayList<String>();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		mylist.add("item4");
		mylist.add("item5");
		mylist.add("item6");
		System.out.println("total items "+ mylist.size());
		System.out.println("Testing item4 exists "+mylist.contains("item4"));
		System.out.println("Printing all items"+ mylist);
		System.out.println("Removing item 3");
		mylist.remove("item3");
		System.out.println("Printing items after removing "+mylist);
		System.out.println("Total size after removing "+mylist.size());
	}

}
