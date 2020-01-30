package demo;

import java.util.HashSet;
import java.util.Set;

public class program43_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> myset = new HashSet<Integer>();
		myset.add(2);
		myset.add(1);
		myset.add(1); //no duplicates and ordered
		myset.add(2);
		myset.add(3);
		myset.add(4);
		System.out.println(myset);
		for(int s : myset)
		{
			System.out.println(s);
		}
		
	}

}
