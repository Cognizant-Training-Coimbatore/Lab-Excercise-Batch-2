package Project1;

import java.util.TreeMap;

public class Q_no_20_28 {

	public static void main(String[] args) {
		TreeMap<Integer,String>map1=new TreeMap<Integer,String>();
		map1.put(1,"Red");
		map1.put(2,"Blue");
		map1.put(3,"Green");
		map1.put(4,"Yellow");
		map1.put(5,"White");
		System.out.println("Original content is "+map1);
		System.out.println("key less than 3: "+map1.headMap(3,true));

	}

}
