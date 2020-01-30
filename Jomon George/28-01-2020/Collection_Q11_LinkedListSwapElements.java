package Exercise;

import java.util.Collections;
import java.util.LinkedList;

public class Collection_Q11_LinkedListSwapElements {

	public static void main(String[] args) {
		
		LinkedList<String> l_list = new LinkedList <String> ();

		  l_list.add("Red");
		  l_list.add("Green");
		  l_list.add("Black");
		  l_list.add("Pink");
		  l_list.add("orange");

		  System.out.println("The Original linked list: " + l_list);

		  Collections.swap(l_list, 0, 2);
		  System.out.println("The New linked list after swap: " + l_list);
	}

}
