package demo;

import java.util.ArrayList;
import java.util.List;

public class ex6_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String> ();
		list1.add("Black");
		list1.add("White");
		list1.add("Red");
		list1.add("yellow");
		((ArrayList<String>) list1).ensureCapacity(5);
         list1.add("blue");
	
		  System.out.println(list1);
	}

}
