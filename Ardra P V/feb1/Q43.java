package jan31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> array=new HashSet<String>();
		array.add("red");
		array.add("white");
		array.add("green");
		array.add("pink");
		array.add("orange");
		System.out.println(array);
		List<String> list=new ArrayList<String>(array);
		System.out.println("ArrayList: " +list);


	}

}
