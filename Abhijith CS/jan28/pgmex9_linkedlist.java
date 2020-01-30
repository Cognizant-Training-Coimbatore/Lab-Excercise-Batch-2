package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class pgmex9_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		Iterator p = l_list.listIterator(3);
		while (p.hasNext()) 
		{
		   System.out.println(p.next());
		}
	}

}
