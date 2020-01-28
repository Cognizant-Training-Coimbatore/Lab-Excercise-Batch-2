package sol.java;

import java.util.Iterator;
import java.util.TreeSet;





public class program7_treeset {

	public static void main(String[] args)
	{
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("venkat");
		myset.add("ravi");
		myset.add("abdu");
		myset.add("karan");
		System.out.println(myset);
		Iterator iterator1 = myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}

	}	
}
