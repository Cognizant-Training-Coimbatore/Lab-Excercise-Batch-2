package sol.java;

import java.util.HashSet;
import java.util.Set;

public class program10_hashset {

	public static void main(String[] args)
	{
		Set<String> ob = new HashSet<String>();
		ob.add("one");
		ob.add("two");
		ob.add("three");
		ob.add("four");
		ob.add("five");
		for(String s:ob)
		{
			System.out.println(s);
		}
	}

}
