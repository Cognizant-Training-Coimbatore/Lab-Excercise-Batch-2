package jan31;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> array=new HashSet<String>();
		array.add("red");
		array.add("white");
		array.add("green");
		array.add("pink");
		array.add("orange");
		System.out.println(array);
		Set<String> tree=new TreeSet<String>(array);
		System.out.println("TreeSet: ");
		for(String str: tree)
		{
			System.out.println(str);
		}

	}

}
