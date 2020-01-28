package sol.java;

import java.util.ArrayList;
import java.util.List;

public class program9_stringlist {

	public static void main(String[] args)
	{
		List<String> a1 = new ArrayList<String>();
		a1.add("Amit");
		a1.add("vijay");
		a1.add("kumar");
		a1.add("sachin");
		System.out.println("An element at 2nd position: "+a1.get(1));
		for(String s:a1)
		{
			System.out.println(s);
		}
	}

}
