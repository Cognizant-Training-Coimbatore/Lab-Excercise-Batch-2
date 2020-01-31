package jan31;

import java.util.HashSet;

public class Question45 {

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
		array1.add("black");
		array1.add("violet");
		array1.add("pink");
		System.out.println(array1);
		array.retainAll(array1);
		System.out.println("common elements are :" +array);

	}

}
