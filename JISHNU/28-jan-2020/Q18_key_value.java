package day6;

import java.util.HashMap;
import java.util.TreeMap;

public class Q18_key_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer, String>();
		map1.put(1, "Jishnu");
		map1.put(2, "vishnu");
		map1.put(6, "Vishu");
		map1.put(4, "Onam");
		System.out.println("Least key value "+map1.firstEntry());
		System.out.println("Greatest key value "+map1.lastEntry());
	}

}
