package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class pgmex13_addtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset = new TreeSet<Integer>();
		myset.add(1);
		myset.add(4);
		myset.add(2);
		myset.add(3);
		System.out.println(myset);
		TreeSet<Integer> myset1 = new TreeSet<Integer>();
		myset1.add(1);
		myset1.add(5);
		myset1.add(6);
		myset1.add(3);
		System.out.println(myset1);
		myset.addAll(myset1);
		System.out.println(myset);
	}

}
