package project1;

import java.util.Iterator;
import java.util.LinkedList;

public class jan28_q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
LinkedList<String> ob=new LinkedList<String>();
		
		ob.add("red");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println("The list is:"+ob);
		
		Iterator iterator1=ob.listIterator(2);
		System.out.println("The iterated list is:");
		while(iterator1.hasNext())
		{
			Object o=iterator1.next();
			System.out.println(o);
		}
		
		
	}

}
