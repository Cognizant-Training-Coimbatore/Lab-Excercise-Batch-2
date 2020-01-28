package demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Question9_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("apple");
		list1.add("orange");
		list1.add("banana");
		list1.add("grapes");
		Iterator p=list1.listIterator(1);
		while(p.hasNext())
		{
			//System.out.println(p.next());
			Object obj=p.next();
			System.out.println(obj);
		}
		

	}

}
