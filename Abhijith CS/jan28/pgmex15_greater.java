package collections;

import java.util.TreeSet;

public class pgmex15_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset = new TreeSet<Integer>();
		myset.add(1);
		myset.add(8);
		myset.add(2);
		myset.add(3);
		System.out.println("Number greater than 2 :"+myset.higher(2));
	}

}
