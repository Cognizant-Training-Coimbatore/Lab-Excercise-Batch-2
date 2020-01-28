package demo;

import java.util.ArrayList;
import java.util.List;

public class Question3_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1=new ArrayList<String>();
		
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");
		System.out.println("before adding:"+a1);
		a1.add(0, "zero");
		System.out.println("after adding"+a1);

	}

}
