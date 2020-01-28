package Package3;

import java.util.TreeMap;

public class program119_set6_q20 {

	public static void main(String[] args) {
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		  tree_map1.put(10, "Red");
		  tree_map1.put(20, "Green");
		  tree_map1.put(40, "Black");
		  tree_map1.put(50, "White");
		  tree_map1.put(60, "Pink");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Key(s): " + tree_map1.headMap(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Key(s): " + tree_map1.headMap(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Key(s): " + tree_map1.headMap(70));
	}

}
