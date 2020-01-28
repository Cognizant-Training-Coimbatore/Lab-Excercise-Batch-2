import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class p105_iterate {

	public static void main(String[] args) {
		LinkedList<String> ob=new LinkedList<String>();
		
		ob.add("red");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println("The list is:"+ob);
		
		ListIterator<String> iterator1=ob.listIterator(2);
		System.out.println("The iterated list is:");
		while(iterator1.hasNext())
		{
			Object o=iterator1.next();
			System.out.println(o);

	}

}
}
