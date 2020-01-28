import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class p84_tree {

	public static void main(String[] args) {
		TreeSet<String> m=new TreeSet();
		m.add("one");
		m.add("two");
		m.add("three");
		m.add("four");
		System.out.println(m);
		java.util.Iterator<String> name=m.iterator();
		System.out.println("using iterator.....");
		while(name.hasNext())
		{
			Object ob=name.next();
			System.out.println(ob);
			
		}
		System.out.println("using loop..");
		for(Object ob:m)//not in order
		{
			System.out.println(ob);
		}


	}

}
