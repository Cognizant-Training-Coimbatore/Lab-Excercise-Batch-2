package jan31;

import java.util.HashSet;

public class Question40 {

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
		array1=(HashSet)array.clone();
		System.out.println("cloned hashset " +array);
	}

}
