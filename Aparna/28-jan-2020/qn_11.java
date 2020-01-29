package set_6;

import java.util.Collections;
import java.util.LinkedList;

public class qn_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new  LinkedList<String>();
		list.add("ron");
		list.add("ria");
		list.add("lia");
		System.out.println("before swapping : " +list);
		Collections.swap(list, 1, 2);
		System.out.println(list);
	}

}
