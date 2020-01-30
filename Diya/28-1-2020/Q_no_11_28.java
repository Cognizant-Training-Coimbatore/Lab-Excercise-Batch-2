package Project1;

import java.util.Collections;
import java.util.List;

import com.graphbuilder.struc.LinkedList;

public class Q_no_11_28 {

	public static void main(String[] args) {
		List<String>mylist=new java.util.LinkedList<String>();
		mylist.add("Red");
		mylist.add("Blue");
		mylist.add("Green");
		mylist.add("Yellow");
		mylist.add("White");
		System.out.println("List before swapping: "+mylist);
		Collections.swap(mylist, 2, 4);
		System.out.println("List after swapping: "+mylist);
	}

}
