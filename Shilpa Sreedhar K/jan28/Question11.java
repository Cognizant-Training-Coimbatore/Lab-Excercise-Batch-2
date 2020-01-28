package jan28;

import java.util.ArrayList;
import java.util.Collections;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("pink");
		list1.add("white");
		System.out.println(list1);
		Collections.swap(list1, 2, 4);
		System.out.println(list1);
		

	}

}
