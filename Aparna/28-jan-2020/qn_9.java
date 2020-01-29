package set_6;

import java.util.Iterator;
import java.util.LinkedList;

public class qn_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Red");
		list1.add("Yellow");
		list1.add("Brown");
		list1.add("Brown");
		list1.add("White");
		list1.add("Blue");

		Iterator p = list1.listIterator(1);
		while(p.hasNext()) {
		System.out.println(p.next());
		}
	}

}
