package demo;

import java.util.ArrayList;

public class program42_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(100);
		
		System.out.println(list1.contains(100));
	}

}
