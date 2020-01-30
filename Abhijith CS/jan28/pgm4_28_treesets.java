package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class pgm4_28_treesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("Abhijith");
		myset.add("Stani");
		myset.add("Irfan");
		
		System.out.println(myset);
		Iterator itr1= myset.iterator();
		while(itr1.hasNext())
		{
			Object obj  = itr1.next();
			System.out.println(obj);
		}
	}

}
