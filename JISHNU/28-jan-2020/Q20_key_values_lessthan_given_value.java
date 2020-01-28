package day6;

import java.util.TreeMap;

public class Q20_key_values_lessthan_given_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer, String>();
		map1.put(1, "Jishnu");
		map1.put(2, "vishnu");
		map1.put(6, "Vishu");
		map1.put(4, "Onam");
		map1.put(7, "Sharun");
		System.out.println("Key less than or equal to 4");
		System.out.println(map1.headMap(4,true));
		
	}

}
