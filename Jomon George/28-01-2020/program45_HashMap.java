package demo;

import java.util.HashMap;

public class program45_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"venkat");
		map1.put(2,"raja");
		map1.put(3,"jijo");
		map1.put(4,"sarath");
		
		String empname = map1.get(2);
		System.out.println(empname);
		
		map1.remove(4);
		System.out.println(map1);
	}

}
