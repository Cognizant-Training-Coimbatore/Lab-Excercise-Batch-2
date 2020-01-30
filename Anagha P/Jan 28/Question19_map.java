package project1;

import java.util.TreeMap;

public class Question19_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "anagha");
		map.put(2, "john");
		map.put(3, "sam");
		map.put(4, "varun");
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());


	}

}
