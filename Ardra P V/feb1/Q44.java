package jan31;

import java.util.HashSet;

public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> array=new HashSet<String>();
		array.add("red");
		array.add("white");
		array.add("green");
		array.add("pink");
		array.add("orange");
		System.out.println(array);
		HashSet<String> array1=new HashSet<String>();
		array1.add("red");
		array1.add("white");
		array1.add("violet");
		array1.add("pink");
		array1.add("orange");
		System.out.println(array1);
		HashSet<String> array2=new HashSet<String>();
		for(String str: array)
		{
			System.out.println(array1.contains(str)? "yes" : "no");
		}

	}

}
