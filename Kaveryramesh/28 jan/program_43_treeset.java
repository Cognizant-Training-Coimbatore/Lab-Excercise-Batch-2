package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class program_43_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("kavery");
		myset.add("fathima");
		myset.add("sasna");

		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
	}

}
