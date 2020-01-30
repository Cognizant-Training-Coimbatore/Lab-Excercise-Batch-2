package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class pgm9_28_trreesetsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("unix");
		myset.add("java");
		
		System.out.println("Using Iterator object.....");
		Iterator itr1= myset.iterator();
		while(itr1.hasNext())
		{
			Object obj  = itr1.next();
			System.out.println(obj);
		}
		System.out.println("Using for loop....");
		for(Object obj:myset)
		{
			System.out.println(obj);
		}
	}

}
