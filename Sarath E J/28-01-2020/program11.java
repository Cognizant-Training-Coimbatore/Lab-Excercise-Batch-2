package sol.java;

import java.util.Iterator;
import java.util.TreeSet;

public class program11 {

	public static void main(String[] args)
	{
		TreeSet<String> ob = new TreeSet<String>();
		ob.add("java");
		ob.add("selenium");
		ob.add("c++");
		ob.add("pearl");
		ob.add("ada");
		System.out.println(ob);
		Iterator iterator1 = ob.iterator();
		System.out.println("using iterator");
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
		System.out.println("Using for loop");
		for(Object obj : ob)
		{
			System.out.println(obj);

	}	

	}

}
