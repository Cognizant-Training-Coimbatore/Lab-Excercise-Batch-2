package pgm_excercises_28_jan;

import java.util.HashSet;
import java.util.Set;

public class pgm_12 {

	public static void main(String[] args)
	{
		Set<String> myset=new HashSet<String>();
		myset.add("nikhila");
		myset.add("kamal");
		myset.add("java");
		System.out.println("first set: " + myset);
		Set<String> myset1=new HashSet<String>();
		myset1.add("nikhila");
		myset1.add("ada");
		myset1.add("java");
		System.out.println("second set: " + myset1);
		myset.retainAll(myset1);
		System.out.println(myset);
		
	}

}
