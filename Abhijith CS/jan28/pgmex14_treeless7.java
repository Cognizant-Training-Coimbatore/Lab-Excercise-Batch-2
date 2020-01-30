package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class pgmex14_treeless7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset = new TreeSet<Integer>();
		TreeSet<Integer> treehead = new TreeSet<Integer>();
		myset.add(1);
		myset.add(8);
		myset.add(2);
		myset.add(3);
		treehead = (TreeSet)myset.headSet(7);
		Iterator iterator = treehead.iterator();
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			System.out.println(obj);
		}
		}

}
