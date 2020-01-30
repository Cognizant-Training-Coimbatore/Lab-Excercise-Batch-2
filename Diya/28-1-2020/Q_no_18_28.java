package Project1;

import java.util.TreeMap;

public class Q_no_18_28 {

	public static void main(String[] args) {
		TreeMap<String,String>map1=new TreeMap<String,String>();
		map1.put("a","Red");
		map1.put("b","Blue");
		map1.put("c","Green");
		map1.put("d","Yellow");
		map1.put("e","White");
		System.out.println("Original content is "+map1);
		System.out.println("Greatest key "+map1.firstEntry());
		System.out.println("Least key "+map1.lastEntry());


	}

}
