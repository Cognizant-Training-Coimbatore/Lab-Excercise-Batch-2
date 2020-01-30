package demo;

import java.util.ArrayList;
import java.util.List;

public class program46_stringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a1 = new ArrayList<String>();
		a1.add("amit");
		a1.add("john");
		a1.add("sarath");
		a1.add("joe");
		System.out.println("An element at 2nd position : "  + a1.get(1));
		
		for(String s:a1)
		{
			System.out.println(s);
		}
	}

}
