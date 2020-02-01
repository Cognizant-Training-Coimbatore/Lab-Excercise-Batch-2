package jan31;

import java.util.HashSet;

public class Q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> array=new HashSet<String>();
		array.add("red");
		array.add("white");
		array.add("green");
		array.add("pink");
		array.add("orange");
		System.out.println(array);
		String[] array1=new String[array.size()];
		array.toArray(array1);
		System.out.println("TreeSet: ");
		for(String str: array1)
		{
			System.out.println(str);
		}

	}

}
