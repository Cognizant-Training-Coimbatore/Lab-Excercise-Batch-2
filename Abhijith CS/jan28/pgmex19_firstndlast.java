package collections;

import java.util.HashMap;
import java.util.NavigableMap;

public class pgmex19_firstndlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer, String> map1=new TreeMap<>();
		map1.put(1,"Abhijith");
		map1.put(2,"Stani");
		map1.put(3,"Irfan");
		System.out.println(map1.firstKey());
		System.out.println(map1.lastKey());
	}

}
