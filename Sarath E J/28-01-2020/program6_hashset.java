package sol.java;

import java.util.HashSet;
import java.util.Set;

public class program6_hashset {

	public static void main(String[] args)
	{
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(1);
		myset.add(6);
		myset.add(2);
		myset.add(3);
		
		System.out.println(myset);
	}

}
