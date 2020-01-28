package day6;

import java.util.TreeMap;

public class Q19_key_value_greatest_lowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer, String>();
		map1.put(1, "Jishnu");
		map1.put(2, "vishnu");
		map1.put(6, "Vishu");
		map1.put(4, "Onam");
		System.out.println("Lowest key :"+map1.firstKey());
		System.out.println("Highest key :"+map1.lastKey());
		
	}

}
