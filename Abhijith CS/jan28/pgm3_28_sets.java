package collections;

import java.util.HashSet;
import java.util.Set;

public class pgm3_28_sets 
{
	public static void main(String[] args) 
	{
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(1);
		myset.add(2);
		myset.add(3);
		System.out.println(myset);
	}
}
